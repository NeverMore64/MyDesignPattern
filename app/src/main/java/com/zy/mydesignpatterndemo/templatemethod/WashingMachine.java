package com.zy.mydesignpatterndemo.templatemethod;

/**
 * create by zy on 2020/7/1
 * 创建抽象类，定义洗衣机洗衣服的流程。
 */
public abstract class WashingMachine {

    //1. 洗涤：标准洗与洗羊毛衫力度与速度不一样，由子类去实现。
    abstract void wash();

    //2. 漂洗：标准洗与洗羊毛衫力度与速度不一样，由子类去实现。
    abstract void rinse();

    // 3. 脱水：标准洗与洗羊毛衫力度与速度不一样，由子类去实现。
    abstract void dehydrate();

    //模板方法——洗衣服：标准洗与洗羊毛衫的步骤都是一样的，直接在这里实现
    void washClothes(){
        wash();
        rinse();
        dehydrate();
    }

}
