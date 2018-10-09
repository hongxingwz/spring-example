package com.jianglei.mapper;

import com.jianglei.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author jianglei
 * @since 10/9/18
 */
public interface UserMapper {

    @Select("SELECT * FROM user_test where id = #{id}")
    User getUser(@Param("id") String id);
}
