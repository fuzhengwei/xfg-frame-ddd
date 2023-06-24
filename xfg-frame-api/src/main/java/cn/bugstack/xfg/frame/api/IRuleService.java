package cn.bugstack.xfg.frame.api;

import cn.bugstack.xfg.frame.api.model.request.DecisionMatterRequest;
import cn.bugstack.xfg.frame.api.model.response.DecisionMatterResponse;
import cn.bugstack.xfg.frame.types.Response;

/**
 * @author 小傅哥，微信：fustack
 * @description 规则服务
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IRuleService {

    Response<DecisionMatterResponse> doRule(DecisionMatterRequest request);

}
