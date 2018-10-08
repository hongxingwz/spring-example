package com.jianglei.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;

/**
 * @author jianglei
 * @since 8/3/18
 */
public class CharBean implements ApplicationContextAware{

    private Character c;

    private byte[] bytes;

    private Charset charset;

    private Class<?>[] classes;

    private Class<?> clazz;

    private Boolean bool;

    private Boolean bool1;

    private Boolean bool2;

    private Boolean bool3;

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getBool3() {
        return bool3;
    }

    public void setBool3(Boolean bool3) {
        this.bool3 = bool3;
    }

    public Boolean getBool1() {
        return bool1;
    }

    public void setBool1(Boolean bool1) {
        this.bool1 = bool1;
    }

    public Boolean getBool2() {
        return bool2;
    }

    public void setBool2(Boolean bool2) {
        this.bool2 = bool2;
    }

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Class<?>[] getClasses() {
        return classes;
    }

    public void setClasses(Class<?>[] classes) {
        this.classes = classes;
    }

    public Character getC() {
        return c;
    }

    public void setC(Character c) {
        this.c = c;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    @Override
    public String toString() {
        return "CharBean{" +
                "c=" + c +
                '}';
    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        Map<String, PropertyEditorRegistrar> beansOfType = applicationContext.getBeansOfType(PropertyEditorRegistrar.class);
        System.out.println(beansOfType);

    }

    @PostConstruct
    public void post() {
        System.out.println(this.date);
    }
}
