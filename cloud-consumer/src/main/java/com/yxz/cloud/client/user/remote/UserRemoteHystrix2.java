package com.yxz.cloud.client.user.remote;

import com.yxz.cloud.client.user.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * allbackFactory写法二
 * Feign Hystrix回退: UserFeignClient的fallbackFactory类，该类需实现FallbackFactory接口，并覆写create方法
 * Hystrix支持回退的概念：当电路打开或出现错误时执行的默认代码路径。
 */
@Component
public class UserRemoteHystrix2 implements FallbackFactory<UserRemote> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRemoteHystrix2.class);

    @Override
    public UserRemote create(Throwable cause) {
        return new UserRemote() {
            @Override
            public User findById(Long id) {
                LOGGER.info("fallback; reason was:", cause);
                User user = new User();
                user.setId(-1L);
                user.setUsername("默认用户");
                user.setAge(0);
                user.setBalance((double) 0);
                return user;
            }
        };

    }
}
