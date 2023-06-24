package cn.bugstack.xfg.frame.domain.rule.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author 小傅哥，微信：fustack
 * @description 决策物料实体
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DecisionMatterEntity {

    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 决策值
     */
    private Map<String, Object> valMap;

}
