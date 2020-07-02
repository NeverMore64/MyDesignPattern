package com.zy.mydesignpatterndemo.factorymode;

/**
 * create by zy on 2020/7/1
 * 客户端使用
 */
public class Client {

    public static void main(String[] args){
        Factory factory = new ConcreteFactory();

        // 创建产品A
        Product productA = factory.createProduct(ConcreteProductA.class);
        productA.method();

        //创建产品B
        Product productB = factory.createProduct(ConcreteProductB.class);
        productB.method();
    }

}
