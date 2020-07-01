package com.zy.mydesignpatterndemo.singletonmode;

/**
 * create by zy on 2020/7/1
 * </p> 静态内部类模式实现单例（线程安全）
 * 小结：这种方式在 Singleton 类加载的时候并没有初始化实例，而是第一次调用 getInstance() 的时候才进行初始化，
 * 可以达到延迟加载对象的作用。并且 JVM 能确保 INSTANCE 只被实例化一次。也就是这种方式可以实现双重校验锁一样的效果，
 * 而且解决了使用 volatile 关键字只能在 JDK 1.5 之后生效和影响性能的问题。但是这种方式用的人还是比较少的
 */
public class MyStaticInnerClassMode {

    private static class SingletonHolder {
        private static final MyStaticInnerClassMode INSTANCE = new MyStaticInnerClassMode();
    }

    private MyStaticInnerClassMode() {

    }

    public static final MyStaticInnerClassMode getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
