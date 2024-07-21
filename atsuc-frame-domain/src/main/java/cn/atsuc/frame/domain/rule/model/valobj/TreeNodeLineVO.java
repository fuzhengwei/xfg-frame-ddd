package cn.atsuc.frame.domain.rule.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 规则树线信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TreeNodeLineVO {

    /** 节点From */
    private Long nodeIdFrom;
    /** 节点To */
    private Long nodeIdTo;
    /** 限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围] */
    private Integer ruleLimitType;
    /** 限定值 */
    private String ruleLimitValue;

}
