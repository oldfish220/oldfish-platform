package com.oldfish.platform.system.service;

import com.oldfish.platform.system.entity.User;

public interface UserService extends BaseService<User> {

    void login(User user);

}
