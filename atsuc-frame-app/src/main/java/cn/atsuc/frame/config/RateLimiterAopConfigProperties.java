package cn.atsuc.frame.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "rate-limiter", ignoreInvalidFields = true)
public class RateLimiterAopConfigProperties {

    /** 最大调用次数 */
    private double permitsPerSecond;
    /** 超时等待时间 */
    private long timeout;

}
