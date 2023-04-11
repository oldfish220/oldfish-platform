package com.oldfish.platform.system.service.impl;

import com.oldfish.platform.system.entity.User;
import com.oldfish.platform.system.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserServiceImplTest {

    @Resource
    UserService userService;

    @Test
    void getById() {
        User user = userService.findById(1L);
        System.out.println(user);
    }

    @Test
    void deleteById() {
        userService.deleteById(2L);
    }

    @Test
    void update() {

    }

    @Test
    void save() {
        User user = new User();
        user.setUsername("张三");
        user.setGender(0);
        user.setPassword("123456");
        user.setIdCard("433513199901031639");
        user.setEmail("132456379@qq.com");
        user.setPhone("13348937054");
        user.setBirthday(LocalDateTime.now());
        user.setLastLogin(LocalDateTime.now());
        user.setIsDeleted(0);
        userService.save(user);
    }

}