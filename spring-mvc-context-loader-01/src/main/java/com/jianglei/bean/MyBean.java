package com.jianglei.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author jianglei
 * @since 7/27/18
 */
public class MyBean {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private int count;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "date=" + date +
                ", count=" + count +
                '}';
    }
}
