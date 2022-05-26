package org.lfy.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.lfy.api.ProviderService;
import org.lfy.model.User;

/**
 * @ClassName: ProviderServiceImpl
 * @Description: 添加@org.apache.dubbo.config.annotation.Service注解，使得该服务可被dubbo发现和调用（暴露服务）
 * @Author: LFY
 * @Created: 2021/8/23 17:19
 * @Versions: V1.0
 */
@Slf4j
@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public User queryUserByUserId(Long userId) {
        log.info("开始调用服务提供者...");
        return User.builder()
                .userId(userId)
                .name("小明")
                .age(18)
                .sex("男")
                .goodAt("篮球")
                .build();
    }
}
