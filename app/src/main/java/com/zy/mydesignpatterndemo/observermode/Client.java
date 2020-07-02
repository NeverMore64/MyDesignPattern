package com.zy.mydesignpatterndemo.observermode;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class Client {

    public static void main(String[] args){
        // 创建被观察者
        DiscountedGoods discountedGoods = new DiscountedGoods();
        // 创建观察者
        Observer observer = new Buyer();
        // 观察者观察被观察者
        discountedGoods.addObserver(observer);
        // 被观察者开始了某个业务
        discountedGoods.activityBegin();

    }

}
