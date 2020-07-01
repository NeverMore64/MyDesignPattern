package com.zy.mydesignpatterndemo.abstratfactorymode;

/**
 * create by zy on 2020/7/1
 * </p>
 */
public class ConcreteFactory1 extends Factory {
    @Override
    public IProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreteProductB1();
    }
}
