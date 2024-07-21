package cn.atsuc.frame.domain.rule.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 规则树根配置
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TreeRootVO {

    /** 规则树ID */
    private Long treeId;
    /** 规则树根ID */
    private Long treeRootNodeId;
    /** 规则树名称 */
    private String treeName;

}
