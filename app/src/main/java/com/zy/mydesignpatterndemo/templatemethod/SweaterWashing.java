package com.zy.mydesignpatterndemo.templatemethod;

/**
 * create by zy on 2020/7/1
 * 洗羊毛衫
 */
public class SweaterWashing extends WashingMachine {
    @Override
    void wash() {
        System.out.println("洗羊毛衫--洗涤");
    }

    @Override
    void rinse() {
        System.out.println("洗羊毛衫--漂洗");
    }

    @Override
    void dehydrate() {
        System.out.println("洗羊毛衫--脱水");
    }
}
