package com.jianglei;

import com.jianglei.example.Blog;
import com.jianglei.example.BlogMapper;
import com.jianglei.example.bean.Blog2;
import com.jianglei.example.bean.Blog3;
import com.jianglei.example.mapper.BlogMapper2;
import com.jianglei.example.mapper.BlogMapper3;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

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

        o = session.selectOne("org.mybatis.example.BlogMapper.selectBlog2", "402881326652be3d016652be413d0000");
        System.out.println(o);

        Blog2 oo = session.selectOne("org.mybatis.example.BlogMapper.selectBlog3", "402881326652be3d016652be413d0000");
        System.out.println(oo);

        Blog3 ooo = session.selectOne("org.mybatis.example.BlogMapper.selectBlog4", "402881326652be3d016652be413d0000");
        System.out.println(ooo);
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


    @Test
    public void testPackageMapper() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            BlogMapper2 mapper = session.getMapper(BlogMapper2.class);
            Blog blog = mapper.selectBlog("402881326652be3d016652be413d0000");
            System.out.println(blog);

            BlogMapper3 mapper3 = session.getMapper(BlogMapper3.class);
            blog = mapper3.selectBlog("402881326652be3d016652be413d0000");

            System.out.println(blog);
        }finally {
            session.close();
        }
    }

    @Test
    public void testEnv() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            BlogMapper2 mapper = session.getMapper(BlogMapper2.class);
            Blog blog = mapper.selectBlog("1");
            System.out.println(blog);

            BlogMapper3 mapper3 = session.getMapper(BlogMapper3.class);
            blog = mapper3.selectBlog("1");

            System.out.println(blog);
        }finally {
            session.close();
        }
    }


    @Test
    public void testResultType() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Object o = session.selectOne("org.mybatis.example.BlogMapper.selectBlog5", "1");
            System.out.println(o.getClass());
            System.out.println(o);


            Map<String, String> map = new HashMap<>();
            map.put("username", "1");
            Object o1 = session.selectOne("org.mybatis.example.BlogMapper.selectBlogWithUsernameLike", map);
            System.out.println(o1);
        }finally {
            session.close();
        }
    }

    @Test
    public void testSQL() {
        String s = new SQL().SELECT("id", "username", "password").FROM("user_test").LEFT_OUTER_JOIN("user_test on 1= 1")

                .WHERE("1=1").AND().WHERE("1=1").OR().WHERE("2=2")
                .toString();
        System.out.println(s);

    }
}
