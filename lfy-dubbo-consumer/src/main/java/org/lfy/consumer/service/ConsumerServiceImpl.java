package org.lfy.consumer.service;

import org.apache.dubbo.config.annotation.Reference;
import org.lfy.api.ProviderService;
import org.lfy.model.User;
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
     * check = false 启动时检查服务提供者是否可用，默认为true
     * url,直接调用的服务目标URL，如果指定，则注册中心无效，本地调用
     * 注册中心挂了，服务仍然可以调用，本地缓存
     */
    @Reference(check = false)
    private ProviderService providerService;

    public User getUser(Long userId) {
        return providerService.queryUserByUserId(userId);
    }
}
