package cn.bugstack.xfg.frame.config;

import cn.bugstack.xfg.frame.aop.RateLimiterAop;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.shaded.com.google.common.util.concurrent.RateLimiter;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.ThreadPoolExecutor;

@Slf4j
@EnableAsync
@Configuration
@EnableConfigurationProperties(RateLimiterAopConfigProperties.class)
public class RateLimiterAopConfig {

    @Bean
    @ConditionalOnMissingBean(RateLimiterAop.class)
    public RateLimiterAop rateLimiterAop(RateLimiterAopConfigProperties properties) {
        return new RateLimiterAop(properties.getPermitsPerSecond(), properties.getTimeout());
    }

}
