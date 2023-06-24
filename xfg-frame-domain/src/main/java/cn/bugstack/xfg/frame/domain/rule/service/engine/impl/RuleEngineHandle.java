package cn.bugstack.xfg.frame.domain.rule.service.engine.impl;

import cn.bugstack.xfg.frame.domain.rule.model.aggregates.TreeRuleAggregate;
import cn.bugstack.xfg.frame.domain.rule.model.entity.DecisionMatterEntity;
import cn.bugstack.xfg.frame.domain.rule.model.entity.EngineResultEntity;
import cn.bugstack.xfg.frame.domain.rule.model.valobj.TreeNodeVO;
import cn.bugstack.xfg.frame.domain.rule.repository.IRuleRepository;
import cn.bugstack.xfg.frame.domain.rule.service.engine.EngineBase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 规则引擎处理器
 * @author: 小傅哥，微信：fustack
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Service("ruleEngineHandle")
public class RuleEngineHandle extends EngineBase {

    @Resource
    private IRuleRepository ruleRepository;

    @Override
    public EngineResultEntity process(DecisionMatterEntity matter) {
        // 决策规则树
        TreeRuleAggregate treeRuleRich = ruleRepository.queryTreeRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null!");
        }

        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);

        // 决策结果
        return new EngineResultEntity(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }

}
