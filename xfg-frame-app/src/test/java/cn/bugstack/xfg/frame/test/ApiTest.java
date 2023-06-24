package cn.bugstack.xfg.frame.test;

import cn.bugstack.xfg.frame.domain.rule.model.entity.DecisionMatterEntity;
import cn.bugstack.xfg.frame.domain.rule.model.entity.EngineResultEntity;
import cn.bugstack.xfg.frame.domain.rule.service.engine.EngineFilter;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Resource
    private EngineFilter engineFilter;

    @Test
    public void test_process() {
        DecisionMatterEntity req = new DecisionMatterEntity();
        req.setTreeId(2110081902L);
        req.setUserId("fustack");
        req.setValMap(new HashMap<String, Object>() {{
            put("gender", "man");
            put("age", "25");
        }});

        EngineResultEntity res = engineFilter.process(req);

        log.info("请求参数：{}", JSON.toJSONString(req));
        log.info("测试结果：{}", JSON.toJSONString(res));
    }

}
