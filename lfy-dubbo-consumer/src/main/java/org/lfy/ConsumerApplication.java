package org.lfy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: ConsumerApplication
 * @Description: TODO
 * @Author: LFY
 * @Created: 2021/8/23 18:37
 * @Versions: V3.0
 * @Company: ©2021东方微银科技（西安）有限公司
 */
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
