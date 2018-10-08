package com.jianglei.template;

/**
 * @author jianglei
 * @since 8/3/18
 */
public abstract class DodishTemplate {

    public void dodish() {
        preparation();
        doing();
        carriedDishes();
    }

    public abstract void preparation();

    public abstract void doing();

    public abstract void carriedDishes();
}
