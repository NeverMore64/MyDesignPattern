package com.zy.mydesignpatterndemo.factorymode.simplefactory;

import com.zy.mydesignpatterndemo.factorymode.Product;

/**
 * create by zy on 2020/7/1
 * 如果一个模块只需要一个工厂类，这时候抽象工厂类的存在就没有必要了，去掉抽象工厂类就变成简单工厂模式了，
 * 也可以叫静态工厂模式。具体做法是去掉抽象工厂类，将具体工厂类中的方法改成静态方法。
 */
public class ConcreteFactory {

    public static <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        String classname = clz.getName();
        try {
            product = (Product) Class.forName(classname).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }

}
