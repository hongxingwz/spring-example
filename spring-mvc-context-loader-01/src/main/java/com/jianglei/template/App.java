package com.jianglei.template;

/**
 * @author jianglei
 * @since 8/3/18
 */
public class App {
    public static void main(String[] args) {
        DodishTemplate eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println("------------");
        DodishTemplate bouilli = new Bouilli();
        bouilli.dodish();
    }
}
