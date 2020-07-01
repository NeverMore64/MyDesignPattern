package com.zy.mydesignpatterndemo.factorymode.simplefactory;

import com.zy.mydesignpatterndemo.factorymode.ConcreteProductA;
import com.zy.mydesignpatterndemo.factorymode.ConcreteProductB;
import com.zy.mydesignpatterndemo.factorymode.Product;

/**
 * create by zy on 2020/7/1
 * </p>
 */
public class Client {

    public void main() {

        // 创建产品A
        Product productA = ConcreteFactory.createProduct(ConcreteProductA.class);
        productA.method();

        Product productB = ConcreteFactory.createProduct(ConcreteProductB.class);
        productB.method();

    }

}
