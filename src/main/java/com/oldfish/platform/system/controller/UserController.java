package com.oldfish.platform.system.controller;

import com.oldfish.platform.system.entity.Result;
import com.oldfish.platform.system.entity.User;
import com.oldfish.platform.system.service.UserService;
import com.oldfish.platform.system.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    Result<User> getById(@PathVariable Long id) {
        log.info("查询用户信息，id：{}", id);
        return Result.ok(userService.findById(id));
    }

    @PostMapping("/save")
    Result<Void> save(@RequestBody User user) {
        userService.save(user);
        return Result.ok();
    }

    @PutMapping("/update")
    Result<Void> update(@RequestBody User user) {
        userService.updateById(user);
        return Result.ok();
    }

    @DeleteMapping("/{id}")
    Result<Void> delete(@PathVariable Long id) {
        userService.deleteById(id);
        return Result.ok();
    }

    @RequestMapping("/login")
    Result<String> login(@RequestBody User user) {
        userService.login(user);
        String token = JwtUtil.generateToken(user.getId(), user.getUsername());
        return Result.ok(token);
    }

}
