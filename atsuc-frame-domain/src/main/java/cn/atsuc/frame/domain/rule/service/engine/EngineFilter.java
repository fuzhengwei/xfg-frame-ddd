package cn.atsuc.frame.domain.rule.service.engine;

import cn.atsuc.frame.domain.rule.model.entity.DecisionMatterEntity;
import cn.atsuc.frame.domain.rule.model.entity.EngineResultEntity;

/**
 * @description: 规则过滤器引擎
 */
public interface EngineFilter {

    /**
     * 规则过滤器接口
     *
     * @param matter      规则决策物料
     * @return            规则决策结果
     */
    EngineResultEntity process(final DecisionMatterEntity matter);

}
