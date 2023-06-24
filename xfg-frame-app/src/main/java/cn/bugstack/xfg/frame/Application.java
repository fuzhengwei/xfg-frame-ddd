package cn.bugstack.xfg.frame;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * -javaagent:/Users/fuzhengwei1/Documents/develop/skywalking/skywalking-agent-8-9/skywalking-agent.jar -Dskywalking.agent.service_name=xfg-frame-test -Dskywalking.collector.backend_service=127.0.0.1:11800
 */
@SpringBootApplication
@Configurable
@EnableDubbo
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

}
