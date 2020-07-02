package com.zy.mydesignpatterndemo.proxymode;

/**
 * create by zy on 2020/7/2
 * 创建具体对象类（小明找代购购买港版 iPhone），实现抽象对象接口
 */
public class RealSubject implements Subject {
    @Override
    public void buy() {
        System.out.println("购买港版 iPhone");
    }
}
