package com.zy.mydesignpatterndemo.abstratfactorymode;

/**
 * create by zy on 2020/7/1
 * 抽象工厂模式
 * 优点:客户端创建一组对象只需要知道对应的工厂类即可，不需要关心创建对象的细节。
 *
 * 缺点:产品家族的扩展困难，例如增加 C 产品家族，需要修改原有的代码，违反了开闭原则。
 *
 * 使用场景：创建一组相关或相互依赖的对象的时候可以使用抽象工厂模式。例如需要开发一个在 Android 和 IOS 上的应用，
 *           因为是同一个类型的应用，所以 UI 和逻辑都是差不多的，只是运行的操作系统不一样而已，
 *           这时候可以使用抽象工厂模式处理不同操作系统之间的交互
 */
public class Client {

    public static void main(String[] args){
        Factory concreteFactory1 = new ConcreteFactory1();
        Factory concreteFactory2 = new ConcreteFactory2();
        IProductA productA1 = concreteFactory1.createProductA();
        IProductA productA2 = concreteFactory2.createProductA();
        IProductB productB1 = concreteFactory1.createProductB();
        IProductB productB2 = concreteFactory2.createProductB();

        productA1.method();
        productA2.method();
        productB1.method();
        productB2.method();
    }

}
