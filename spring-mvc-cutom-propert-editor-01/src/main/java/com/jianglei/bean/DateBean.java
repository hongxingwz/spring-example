package com.jianglei.bean;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * @author jianglei
 * @since 8/3/18
 */
public class DateBean {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DateBean{" +
                "date=" + date +
                '}';
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(toString());
    }
}
