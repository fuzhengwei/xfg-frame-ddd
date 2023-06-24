package cn.bugstack.xfg.frame.domain.rule.model.aggregates;

import cn.bugstack.xfg.frame.domain.rule.model.valobj.TreeNodeVO;
import cn.bugstack.xfg.frame.domain.rule.model.valobj.TreeRootVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @description: 规则树聚合
 * @author: 小傅哥，微信：fustack
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
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
