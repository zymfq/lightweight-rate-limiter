package io.redick01.ratelimiter.starter.configure;

import com.alibaba.cloud.nacos.NacosConfigProperties;
import io.redick01.ratelimiter.starter.refresh.CloudNacosRefresher;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Redick01
 */
@Configuration
@ConditionalOnClass(NacosConfigProperties.class)
public class CloudNacosAutoConfiguration {

    @Bean
    public CloudNacosRefresher cloudNacosRefresher() {
        return new CloudNacosRefresher();
    }
}
