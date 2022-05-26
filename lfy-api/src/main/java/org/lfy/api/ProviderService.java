package org.lfy.api;

import org.lfy.model.User;

/**
 * @ClassName: ProviderService
 * @Description: TODO
 * @Author: LFY
 * @Created: 2021/8/23 17:19
 * @Versions: V1.0
 */
public interface ProviderService {

    /**
     * provider
     *
     * @param userId Long
     * @return User
     */
    User queryUserByUserId(Long userId);
}
