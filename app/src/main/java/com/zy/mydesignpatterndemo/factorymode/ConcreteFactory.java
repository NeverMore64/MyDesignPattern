package com.zy.mydesignpatterndemo.factorymode;

/**
 * create by zy on 2020/7/1
 * 具体工厂
 */
public class ConcreteFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
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
