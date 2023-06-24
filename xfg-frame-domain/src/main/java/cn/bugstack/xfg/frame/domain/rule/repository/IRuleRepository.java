package cn.bugstack.xfg.frame.domain.rule.repository;

import cn.bugstack.xfg.frame.domain.rule.model.aggregates.TreeRuleAggregate;

/**
 * @description: 规则信息仓储服务接口
 * @author: 小傅哥，微信：fustack
 * @date: 2021/10/8
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
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
