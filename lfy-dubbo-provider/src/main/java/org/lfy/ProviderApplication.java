package org.lfy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: ProviderApplication
 * @Description: ① ： @EnableDubbo：开启基于注解的dubbo服务
 * ② ： @EnableDiscoveryClient 服务发现
 * @Author: LFY
 * @Created: 2021/8/23 17:53
 * @Versions: V1.0
 */
@SpringBootApplication
@EnableDubbo
@EnableDiscoveryClient
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
