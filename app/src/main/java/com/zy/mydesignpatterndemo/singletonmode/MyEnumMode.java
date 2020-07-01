package com.zy.mydesignpatterndemo.singletonmode;

/**
 * create by zy on 2020/7/1
 * 小结：可以说使用枚举的方式实现单例是目前最完美的方式，这种方式可以防止序列化与反射造成的创建多个实例的问题，
 * 而前面的 5 种方式默认情况是无法解决这个问题的。可能使用枚举的唯一缺点是可读性不高。
 */
public enum  MyEnumMode {
    INSTANCE;

    public void testMethod(){

    }
}
