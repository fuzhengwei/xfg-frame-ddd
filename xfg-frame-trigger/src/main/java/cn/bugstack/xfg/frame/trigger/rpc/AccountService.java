package cn.bugstack.xfg.frame.trigger.rpc;

import cn.bugstack.xfg.frame.api.IAccountService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Random;

@Slf4j
@DubboService(version = "1.0.0")
public class AccountService implements IAccountService {

    public String queryUserName(String req) {
        log.info("查询用户信息 reqStr：{}", JSON.toJSONString(req));
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "花花";
    }

}
