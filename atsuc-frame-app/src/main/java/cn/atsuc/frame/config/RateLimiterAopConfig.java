package cn.atsuc.frame.config;

import cn.atsuc.frame.aop.RateLimiterAop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

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
