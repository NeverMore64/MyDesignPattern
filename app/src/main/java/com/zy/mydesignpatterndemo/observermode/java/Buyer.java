package com.zy.mydesignpatterndemo.observermode.java;

import java.util.Observable;
import java.util.Observer;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class Buyer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我要开始买了");
    }
}
