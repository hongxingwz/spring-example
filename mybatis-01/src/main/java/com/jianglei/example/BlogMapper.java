package com.jianglei.example;

import org.apache.ibatis.annotations.Select;

/**
 * @author jianglei
 * @since 10/8/18
 */
public interface BlogMapper {

    @Select("SELECT * FROM user_test WHERE id = #{id}")
    Blog selectBlog(String blog);
}
