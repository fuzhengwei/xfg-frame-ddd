package cn.atsuc.xfg.frame.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 规则树节点
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RuleTreeNodePO {

    /** 主键ID */
    private Long id;
    /** 规则树ID */
    private Long treeId;
    /** 节点类型；1子叶、2果实 */
    private Integer nodeType;
    /** 节点值[nodeType=2]；果实值 */
    private String nodeValue;
    /** 规则Key */
    private String ruleKey;
    /** 规则描述 */
    private String ruleDesc;

}
