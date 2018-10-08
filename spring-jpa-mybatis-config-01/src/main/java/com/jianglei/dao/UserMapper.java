package com.jianglei.dao;

import com.jianglei.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * @author jianglei
 * @since 10/8/18
 */
@Mapper
public interface UserMapper {

    User getByUsername(@Param("username") String username);

    @SelectProvider(type = UserSqlProvider.class, method = "get")
    User get(@Param("useranem") String username, @Param("password") String password);

    @UpdateProvider(type = UserSqlProvider.class, method = "update")
    void update(User user);
}
