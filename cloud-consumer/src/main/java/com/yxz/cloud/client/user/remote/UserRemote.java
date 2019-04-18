package com.yxz.cloud.client.user.remote;

import com.yxz.cloud.client.user.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//name:远程服务名，及spring.application.name配置的名称
@FeignClient(name = "cloud-producer", fallbackFactory = UserRemoteHystrix2.class)
public interface UserRemote {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}