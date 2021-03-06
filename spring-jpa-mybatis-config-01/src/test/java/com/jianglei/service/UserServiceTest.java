package com.jianglei.service;

import com.jianglei.bean.User;
import com.jianglei.config.AppConfig;
import com.jianglei.config.DaoConfig;
import com.jianglei.config.DataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author jianglei
 * @since 10/8/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class, DataSourceConfig.class, DaoConfig.class})
@Rollback(value = false)//关闭自动事务自动回滚
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void save() {
        User o = new User();
        o.setUsername("admin");
        o.setPassword("admin123");

        userService.save(o);
    }

    @Test
    public void getByUsername() {
        User o = userService.getByUsername("admin");
        System.out.println(o);
    }

    @Test
    public void get() {
        User o = userService.get("admin", "admin123");
        System.out.println(o);
    }

    @Test
    public void update() {
        User o = userService.getByUsername("admin");
        o.setUsername("admin2");
        o.setPassword("admin222");
        userService.update(o);
    }

    @Test
    public void insertAndUpdate() {
        userService.insertAndUpdate();
    }
}