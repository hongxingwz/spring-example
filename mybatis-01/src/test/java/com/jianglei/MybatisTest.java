package com.jianglei;

import com.jianglei.example.Blog;
import com.jianglei.example.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author jianglei
 * @since 10/8/18
 */
public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void testInit() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testSelectOne() {
        SqlSession session = sqlSessionFactory.openSession();
        Blog o = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", "402881326652be3d016652be413d0000");
        System.out.println(o);
    }


    @Test
    public void testSelectOne2() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            Blog blog = mapper.selectBlog("402881326652be3d016652be413d0000");
            System.out.println(blog);
        }finally {
            session.close();
        }
    }
}
