package cn.atsuc.frame.domain.rule.service.engine.impl;

import cn.atsuc.frame.domain.rule.model.aggregates.TreeRuleAggregate;
import cn.atsuc.frame.domain.rule.model.valobj.TreeNodeVO;
import cn.atsuc.frame.domain.rule.repository.IRuleRepository;
import cn.atsuc.frame.domain.rule.service.engine.EngineBase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 规则引擎处理器
 */
@Service("ruleEngineHandle")
public class RuleEngineHandle extends EngineBase {

    @Resource
    private IRuleRepository ruleRepository;

    @Override
    public cn.atsuc.frame.domain.rule.model.entity.EngineResultEntity process(cn.atsuc.frame.domain.rule.model.entity.DecisionMatterEntity matter) {
        // 决策规则树
        TreeRuleAggregate treeRuleRich = ruleRepository.queryTreeRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null!");
        }

        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);

        // 决策结果
        return new cn.atsuc.frame.domain.rule.model.entity.EngineResultEntity(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }

}
