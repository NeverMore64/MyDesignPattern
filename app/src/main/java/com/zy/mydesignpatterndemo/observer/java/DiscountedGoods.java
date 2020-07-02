package com.zy.mydesignpatterndemo.observer.java;

import java.util.Observable;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class DiscountedGoods  extends Observable {

    public void activityBegin(){
        System.out.println("活动开始啦");
        super.setChanged();
        super.notifyObservers();
    }

}
