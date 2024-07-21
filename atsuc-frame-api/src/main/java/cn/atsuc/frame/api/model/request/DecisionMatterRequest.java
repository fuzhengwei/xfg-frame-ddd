package cn.atsuc.frame.api.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @description 决策请求对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecisionMatterRequest {

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
