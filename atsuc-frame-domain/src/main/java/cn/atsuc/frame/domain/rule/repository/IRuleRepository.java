package cn.atsuc.frame.domain.rule.repository;

import cn.atsuc.frame.domain.rule.model.aggregates.TreeRuleAggregate;

/**
 * @description: 规则信息仓储服务接口
 */
public interface IRuleRepository {

    /**
     * 查询规则决策树配置
     *
     * @param treeId    决策树ID
     * @return          决策树配置
     */
    TreeRuleAggregate queryTreeRuleRich(Long treeId);

}
