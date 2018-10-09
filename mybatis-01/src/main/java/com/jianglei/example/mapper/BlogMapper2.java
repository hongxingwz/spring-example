package com.jianglei.example.mapper;

import com.jianglei.example.Blog;
import org.apache.ibatis.annotations.Select;

/**
 * @author jianglei
 * @since 10/9/18
 */
public interface BlogMapper2 {

    @Select("SELECT * FROM user_test WHERE id = #{id}")
    Blog selectBlog(String blog);
}
