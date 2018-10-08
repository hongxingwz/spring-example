package com.jianglei.service;

import com.jianglei.bean.User;
import com.jianglei.dao.UserMapper;
import com.jianglei.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jianglei
 * @since 10/8/18
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public void save(User user) {
        userRepository.save(user);
    }

    public User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }

    public User get(String username, String password) {
        return userMapper.get(username, password);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public void insertAndUpdate() {
        User o = new User();
        o.setUsername("guest");
        o.setPassword("guest123");
        save(o);

        User user = getByUsername("admin");
        user.setPassword("admin123456");
        update(user);
    }
}
