package com.zy.mydesignpatterndemo.observer;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class Buyer implements Observer {

    @Override
    public void update() {
        System.out.println("我要开始买啦！");
    }
}
