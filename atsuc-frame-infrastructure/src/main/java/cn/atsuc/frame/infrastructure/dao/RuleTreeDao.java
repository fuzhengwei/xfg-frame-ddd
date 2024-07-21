package cn.atsuc.xfg.frame.infrastructure.dao;
import cn.atsuc.xfg.frame.infrastructure.po.RuleTreePO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 规则树配置DAO
 */
@Mapper
public interface RuleTreeDao {

    /**
     * 规则树查询
     * @param id ID
     * @return   规则树
     */
    RuleTreePO queryRuleTreeByTreeId(Long id);

    /**
     * 规则树简要信息查询
     * @param treeId 规则树ID
     * @return       规则树
     */
    RuleTreePO queryTreeSummaryInfo(Long treeId);

}
