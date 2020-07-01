package com.zy.mydesignpatterndemo.templatemethod;

/**
 * create by zy on 2020/7/1
 * 上面的例子就是典型的模板方法模式。如果你是 Android 开发者，
 * 你会发现很多开源项目的 BaseActivity 使用的就是模板方法模式，
 * 抽象类是 BaseActivity，模板方法是onCreate()，
 * 抽象方法是 initLayout() 、initView()、initPresenter()，
 * 实现类是继承 BaseActivity 的子类。
 */
public class Client {

    public void main() {
        StandardWashing washing = new StandardWashing();
        washing.washClothes();

        SweaterWashing washing1 = new SweaterWashing();
        washing1.washClothes();
    }

}
