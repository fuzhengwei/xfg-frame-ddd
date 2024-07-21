package cn.atsuc.frame.api;

import cn.atsuc.frame.api.model.request.DecisionMatterRequest;
import cn.atsuc.frame.api.model.response.DecisionMatterResponse;
import cn.atsuc.frame.types.Response;

/**
 * @description 规则服务
 */
public interface IRuleService {

    Response<DecisionMatterResponse> doRule(DecisionMatterRequest request);

}
