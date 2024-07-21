package cn.atsuc.frame.infrastructure.repository;

import cn.atsuc.frame.domain.rule.model.aggregates.TreeRuleAggregate;
import cn.atsuc.frame.domain.rule.model.valobj.TreeNodeLineVO;
import cn.atsuc.frame.domain.rule.model.valobj.TreeNodeVO;
import cn.atsuc.frame.domain.rule.model.valobj.TreeRootVO;
import cn.atsuc.frame.domain.rule.repository.IRuleRepository;
import cn.atsuc.frame.types.Constants;
import cn.atsuc.xfg.frame.infrastructure.dao.RuleTreeDao;
import cn.atsuc.xfg.frame.infrastructure.dao.RuleTreeNodeDao;
import cn.atsuc.xfg.frame.infrastructure.dao.RuleTreeNodeLineDao;
import cn.atsuc.xfg.frame.infrastructure.po.RuleTreeNodeLinePO;
import cn.atsuc.xfg.frame.infrastructure.po.RuleTreeNodePO;
import cn.atsuc.xfg.frame.infrastructure.po.RuleTreePO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 规则信息仓储服务
 */
@Repository
public class RuleRepository implements IRuleRepository {

    @Resource
    private RuleTreeDao ruleTreeDao;
    @Resource
    private RuleTreeNodeDao ruleTreeNodeDao;
    @Resource
    private RuleTreeNodeLineDao ruleTreeNodeLineDao;

    @Override
    public TreeRuleAggregate queryTreeRuleRich(Long treeId) {

        // 规则树
        RuleTreePO ruleTree = ruleTreeDao.queryRuleTreeByTreeId(treeId);
        TreeRootVO treeRoot = new TreeRootVO();
        treeRoot.setTreeId(ruleTree.getId());
        treeRoot.setTreeRootNodeId(ruleTree.getTreeRootNodeId());
        treeRoot.setTreeName(ruleTree.getTreeName());

        // 树节点->树连接线
        Map<Long, TreeNodeVO> treeNodeMap = new HashMap<>();
        List<RuleTreeNodePO> ruleTreeNodeList = ruleTreeNodeDao.queryRuleTreeNodeList(treeId);
        for (RuleTreeNodePO treeNode : ruleTreeNodeList) {
            List<TreeNodeLineVO> treeNodeLineInfoList = new ArrayList<>();
            if (Constants.NodeType.STEM.equals(treeNode.getNodeType())) {

                RuleTreeNodeLinePO ruleTreeNodeLineReq = new RuleTreeNodeLinePO();
                ruleTreeNodeLineReq.setTreeId(treeId);
                ruleTreeNodeLineReq.setNodeIdFrom(treeNode.getId());
                List<RuleTreeNodeLinePO> ruleTreeNodeLineList = ruleTreeNodeLineDao.queryRuleTreeNodeLineList(ruleTreeNodeLineReq);

                for (RuleTreeNodeLinePO nodeLine : ruleTreeNodeLineList) {
                    TreeNodeLineVO treeNodeLineInfo = new TreeNodeLineVO();
                    treeNodeLineInfo.setNodeIdFrom(nodeLine.getNodeIdFrom());
                    treeNodeLineInfo.setNodeIdTo(nodeLine.getNodeIdTo());
                    treeNodeLineInfo.setRuleLimitType(nodeLine.getRuleLimitType());
                    treeNodeLineInfo.setRuleLimitValue(nodeLine.getRuleLimitValue());
                    treeNodeLineInfoList.add(treeNodeLineInfo);
                }
            }
            TreeNodeVO treeNodeInfo = new TreeNodeVO();
            treeNodeInfo.setTreeId(treeNode.getTreeId());
            treeNodeInfo.setTreeNodeId(treeNode.getId());
            treeNodeInfo.setNodeType(treeNode.getNodeType());
            treeNodeInfo.setNodeValue(treeNode.getNodeValue());
            treeNodeInfo.setRuleKey(treeNode.getRuleKey());
            treeNodeInfo.setRuleDesc(treeNode.getRuleDesc());
            treeNodeInfo.setTreeNodeLineInfoList(treeNodeLineInfoList);

            treeNodeMap.put(treeNode.getId(), treeNodeInfo);
        }

        TreeRuleAggregate treeRuleRich = new TreeRuleAggregate();
        treeRuleRich.setTreeRoot(treeRoot);
        treeRuleRich.setTreeNodeMap(treeNodeMap);

        return treeRuleRich;
    }

}
