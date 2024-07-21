package cn.atsuc.frame.trigger.rpc;

import cn.atsuc.frame.api.IRuleService;
import cn.atsuc.frame.api.model.request.DecisionMatterRequest;
import cn.atsuc.frame.api.model.response.DecisionMatterResponse;
import cn.atsuc.frame.domain.rule.model.entity.DecisionMatterEntity;
import cn.atsuc.frame.domain.rule.model.entity.EngineResultEntity;
import cn.atsuc.frame.domain.rule.service.engine.EngineFilter;
import cn.atsuc.frame.types.Constants;
import cn.atsuc.frame.types.Response;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@Slf4j
@DubboService(version = "1.0.0")
public class RuleService implements IRuleService {

    @Resource
    private EngineFilter engineFilter;

    @Override
    public Response<DecisionMatterResponse> doRule(DecisionMatterRequest request) {
        log.info("规则引擎过滤 reqStr：{}", JSON.toJSONString(request));
        try {
            // 1. 构建参数
            DecisionMatterEntity entity = DecisionMatterEntity.builder()
                    .userId(request.getUserId())
                    .treeId(request.getTreeId())
                    .valMap(request.getValMap()).build();
            // 2. 调用规则
            EngineResultEntity process = engineFilter.process(entity);
            DecisionMatterResponse DecisionMatter = DecisionMatterResponse.builder().activityId(process.getTreeId()).build();
            // 3. 封装结果
            return Response.<DecisionMatterResponse>builder()
                    .code(Constants.ResponseCode.SUCCESS.getCode())
                    .info(Constants.ResponseCode.SUCCESS.getInfo())
                    .data(DecisionMatter).build();
        } catch (Exception e) {
            log.error("规则引擎过滤失败 reqStr：{}", JSON.toJSONString(request), e);
            return Response.<DecisionMatterResponse>builder()
                    .code(Constants.ResponseCode.UN_ERROR.getCode())
                    .info(Constants.ResponseCode.UN_ERROR.getInfo()).build();
        }
    }

}
