package com.yxz.cloud.producer.controller;

import com.yxz.cloud.producer.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = new User();
        if (id == 1) {
            findOne.setAge(20);
            findOne.setName("张三");
            findOne.setUsername("zhangsan");
            findOne.setId(1L);
            findOne.setBalance(800D);
        } else {
            findOne.setAge(18);
            findOne.setName("lisi");
            findOne.setUsername("lisi");
            findOne.setId(2L);
            findOne.setBalance(2000D);
        }

        //测试负载均衡
//        findOne.setName(findOne.getName() + " 2");
//        System.out.println("request two name is " + findOne.getName());
//        try {
//            Thread.sleep(1000000);
//        } catch (Exception e) {
//            System.out.println("第二次请求错误： " + e.getMessage());
//        }

        return findOne;
    }
}
