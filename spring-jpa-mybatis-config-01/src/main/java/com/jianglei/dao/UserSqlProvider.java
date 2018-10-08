package com.jianglei.dao;

import com.jianglei.bean.User;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @author jianglei
 * @since 10/8/18
 */
@Component
public class UserSqlProvider {

    public String get(Map<String, String> params) {
        String username = params.get("username");
        String password = params.get("password");

        SQL sql = new SQL().SELECT("*").FROM("user_test");
        if (!StringUtils.isEmpty(username)) {
            sql.WHERE("username=#{username}");
        }

        if (!StringUtils.isEmpty(password)) {
            sql.WHERE("password=#{password}");
        }

        return sql.toString();
    }


    public String update(User user) {
        SQL sql = new SQL().UPDATE("user_test").SET("username=#{username}, password=#{password}")
                .WHERE("id=#{id}");
        return sql.toString();
    }
}
