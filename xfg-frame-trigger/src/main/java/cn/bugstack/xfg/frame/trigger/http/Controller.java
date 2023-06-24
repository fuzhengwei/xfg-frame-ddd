package cn.bugstack.xfg.frame.trigger.http;

import cn.bugstack.xfg.frame.types.Constants;
import cn.bugstack.xfg.frame.types.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;

@Slf4j
@RestController
public class Controller {

    @Resource
    private ThreadPoolExecutor threadPoolExecutor;

    /**
     * http://localhost:8090/success
     */
    @RequestMapping("/success")
    public Response<String> success() {
        log.info("测试调用");
        try {
            // 随机休眠
            Thread.sleep(new Random().nextInt(1000));
            // 开启线程
            threadPoolExecutor.execute(() -> {
                log.info("开启线程");
            });
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (new Random().nextInt(100) == 1) throw new RuntimeException("异常");
        return Response.<String>builder()
                .code(Constants.ResponseCode.SUCCESS.getCode())
                .info(Constants.ResponseCode.SUCCESS.getInfo())
                .data("查询用户信息，小傅哥")
                .build();
    }

}
