package com.zy.mydesignpatterndemo.observer;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class DiscountedGoods extends Subject {

    public void activityBegin(){
        System.out.println("活动开始啦!");
        super.notifyObservers();
    }

}
