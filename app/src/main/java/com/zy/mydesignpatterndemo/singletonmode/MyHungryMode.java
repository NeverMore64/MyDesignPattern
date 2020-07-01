package com.zy.mydesignpatterndemo.singletonmode;

/**
 * create by zy on 2020/7/1
 * 饿汉式
 */
public class MyHungryMode {

    private static MyHungryMode mInstancce = new MyHungryMode();

    private MyHungryMode() {

    }

    public static MyHungryMode getInstance() {
        return mInstancce;
    }

}
