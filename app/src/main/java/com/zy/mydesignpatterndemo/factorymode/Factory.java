package com.zy.mydesignpatterndemo.factorymode;

/**
 * create by zy on 2020/7/1
 * 抽象工厂
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
