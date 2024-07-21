package cn.atsuc.frame.domain.rule.service.engine;

import cn.atsuc.frame.domain.rule.model.aggregates.TreeRuleAggregate;
import cn.atsuc.frame.domain.rule.model.valobj.TreeNodeVO;
import cn.atsuc.frame.domain.rule.model.valobj.TreeRootVO;
import cn.atsuc.frame.types.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @description: 规则引擎基础类
 */
public abstract class EngineBase extends EngineConfig implements cn.atsuc.frame.domain.rule.service.engine.EngineFilter {

    private Logger logger = LoggerFactory.getLogger(EngineBase.class);

    @Override
    public cn.atsuc.frame.domain.rule.model.entity.EngineResultEntity process(cn.atsuc.frame.domain.rule.model.entity.DecisionMatterEntity matter) {
        throw new RuntimeException("未实现规则引擎服务");
    }

    protected TreeNodeVO engineDecisionMaker(TreeRuleAggregate treeRuleRich, cn.atsuc.frame.domain.rule.model.entity.DecisionMatterEntity matter) {
        TreeRootVO treeRoot = treeRuleRich.getTreeRoot();
        Map<Long, TreeNodeVO> treeNodeMap = treeRuleRich.getTreeNodeMap();

        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNodeVO treeNodeInfo = treeNodeMap.get(rootNodeId);

        // 节点类型[NodeType]；1子叶、2果实
        while (Constants.NodeType.STEM.equals(treeNodeInfo.getNodeType())) {
            String ruleKey = treeNodeInfo.getRuleKey();
            cn.atsuc.frame.domain.rule.service.logic.LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(matter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLineInfoList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), matter.getUserId(), matter.getTreeId(), treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }

        return treeNodeInfo;
    }

}
