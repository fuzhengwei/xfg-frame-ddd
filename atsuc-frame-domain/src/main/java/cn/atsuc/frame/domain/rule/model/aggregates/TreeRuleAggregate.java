package cn.atsuc.frame.domain.rule.model.aggregates;


import cn.atsuc.frame.domain.rule.model.valobj.TreeNodeVO;
import cn.atsuc.frame.domain.rule.model.valobj.TreeRootVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author: 小傅哥，微信：fustack
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TreeRuleAggregate {

    /** 树根信息 */
    private TreeRootVO treeRoot;
    /** 树节点ID -> 子节点 */
    private Map<Long, TreeNodeVO> treeNodeMap;

}
