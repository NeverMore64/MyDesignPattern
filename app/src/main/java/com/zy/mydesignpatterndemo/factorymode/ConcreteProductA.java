package com.zy.mydesignpatterndemo.factorymode;

/**
 * create by zy on 2020/7/1
 * 具体产品A
 */
public class ConcreteProductA implements Product{
    @Override
    public void method() {
        System.out.println("具体产品A");
    }
}
