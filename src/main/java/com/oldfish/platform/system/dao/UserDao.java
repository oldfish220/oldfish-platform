package com.oldfish.platform.system.dao;

import com.oldfish.platform.system.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseDao<User> {

    User findByUsername(String username);

}
