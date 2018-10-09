package com.jianglei.service;

import com.jianglei.bean.User;
import com.jianglei.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jianglei
 * @since 10/9/18
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User getUser(String id) {
        return userMapper.getUser(id);
    }
}
