package cn.atsuc.frame.domain.rule.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @description 决策物料实体
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
