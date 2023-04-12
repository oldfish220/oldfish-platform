package com.oldfish.platform.system.service.impl;

import com.oldfish.platform.system.dao.UserDao;
import com.oldfish.platform.system.entity.User;
import com.oldfish.platform.system.exception.OldfishException;
import com.oldfish.platform.system.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {

    @Resource
    private AuthenticationManager authenticationManager;

    @Resource
    BCryptPasswordEncoder encoder;

    @Override
    public void save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        super.save(user);
    }

    @Override
    public void login(User user) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());

        try {
            // 使用Spring Security认证方法
            authenticationManager.authenticate(token);
        } catch (AuthenticationException e) {
            throw new OldfishException("用户名或密码错误", e);
        }
    }
}
