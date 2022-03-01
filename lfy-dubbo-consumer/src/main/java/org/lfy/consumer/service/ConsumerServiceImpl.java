package org.lfy.consumer.service;

import org.apache.dubbo.config.annotation.Reference;
import org.lfy.api.ProviderService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ConsumerServiceImpl
 * @Description: TODO
 * @Author: LFY
 * @Created: 2021/8/23 18:28
 * @Versions: V1.0
 */
@Service
public class ConsumerServiceImpl {

    /**
     * 消费者Service2Impl添加@org.springframework.stereotype.Service注解，
     * 同时为其中的服务提供者Service1添加@org.apache.dubbo.config.annotation.Reference注解，
     * 告诉调用者Service1的实现在远端，从注册中心找，要通过dubbo调用
     */
    @Reference
    private ProviderService providerService;

    public String consumer() {
        return providerService.provider("消费者 ： Consumer...");
    }
}
