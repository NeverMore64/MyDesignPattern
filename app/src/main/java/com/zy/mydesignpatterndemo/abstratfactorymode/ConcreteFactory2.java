package com.zy.mydesignpatterndemo.abstratfactorymode;

/**
 * create by zy on 2020/7/1
 * </p>
 */
public class ConcreteFactory2 extends Factory {
    @Override
    public IProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreteProductB2();
    }
}
