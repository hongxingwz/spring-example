package com.jianglei.mapper;

import com.jianglei.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author jianglei
 * @since 10/9/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-context.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testGetUser() {
        User user = userMapper.getUser("1");
        System.out.println(user);
    }

}
