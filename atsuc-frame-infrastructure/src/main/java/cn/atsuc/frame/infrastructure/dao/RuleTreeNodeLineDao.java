package cn.atsuc.xfg.frame.infrastructure.dao;

import cn.atsuc.xfg.frame.infrastructure.po.RuleTreeNodeLinePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: 规则树节点连线DAO
 */
@Mapper
public interface RuleTreeNodeLineDao {

    /**
     * 查询规则树节点连线集合
     * @param req   入参
     * @return      规则树节点连线集合
     */
    List<RuleTreeNodeLinePO> queryRuleTreeNodeLineList(RuleTreeNodeLinePO req);

    /**
     * 查询规则树连线数量
     *
     * @param treeId    规则树ID
     * @return          规则树连线数量
     */
    int queryTreeNodeLineCount(Long treeId);

}
