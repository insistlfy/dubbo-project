package org.lfy.service;

import org.apache.dubbo.config.annotation.Service;
import org.lfy.api.ProviderService;

/**
 * @ClassName: ProviderServiceImpl
 * @Description: 添加@org.apache.dubbo.config.annotation.Service注解，使得该服务可被dubbo发现和调用（暴露服务）
 * @Author: LFY
 * @Created: 2021/8/23 17:19
 * @Versions: V1.0
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String provider(String content) {
        return "服务提供者 ： " + content;
    }
}
