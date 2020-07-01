package com.zy.mydesignpatterndemo.singletonmode;

/**
 * create by zy on 2020/7/1
 * 懒汉式
 */
public class MyLazyMode {

    private static MyLazyMode mInstance = null;

    private MyLazyMode() {

    }

    /***
     * 懒汉式（线程不安全）
     *
     * 只有第一次用到的时候才初始化实例，解决了饿汉式造成内存浪费的问题，但是多线程的时候是不安全的。
     * 例如有线程 A 与线程 B 同时执行，这时候就有可能 2 个线程都同时执行到 if (instance == null)，
     * 这样就创建了 2 个实例了。所以这种方式只适用于单线程。
     */
    public static  MyLazyMode getInstance() {
        if (mInstance == null) {
            mInstance = new MyLazyMode();
        }
        return mInstance;
    }


    /***
     *
     * 懒汉式（线程安全）
     *
     * 在 getInstance 方法上加了同步锁，这样有多个线程的时候会等前面的线程执行完了再执行当前线程，
     * 可以解决第二种懒汉式的线程安全问题
     */
    public static synchronized MyLazyMode getInstance1() {
        if (mInstance == null) {
            mInstance = new MyLazyMode();
        }
        return mInstance;
    }


    /***
     * 双重校验锁（线程安全）
     *
     * 可以看到加了双重 if (instance == null) 的判断，并且同步锁放到了方法内部，
     * 新增的第一个判空可以避免每个线程过来都去执行同步锁，可以解决同步锁造成的效率低的问题。
     *
     * 但是，instance = new Singleton(); 并不是一个原子操作，这一行代码可以分成 3 个步骤：
     *
     *     给 instance 分配内存
     *     初始化 instance，即执行 new Singleton();
     *     将 instance 对象指向分配的内存空间
     *
     * 而且由于 JVM 具有指令重排的特性，也就是说无法保证上面的 3 个步骤是按 1>2>3 执行的，
     * 有可能是 1>3>2。例如线程 A 执行完第 1 步与第 3 步，而没有执行第 2 步，显然 instance 是不为空的，
     * 这个时候线程 B 刚好执行到 if (instance == null) ，发现不为空就直接返回 instance，但是由于一直没有执行到第 2 步，
     * 所以 instance 虽然不为空，但是是没有初始化完成的，所以调用一个没有初始化完成的实例肯定是有问题的。
     *
     * 所以代码中使用了 volatile 关键字，因为它可以解决指令重排的问题，但是只能在 JDK 1.5 之后生效。而且使用 volatile 关键字也会影响一些性能问题
     */
    public static MyLazyMode getInstance2() {
        if (mInstance == null) {
            synchronized (MyLazyMode.class) {
                if (mInstance == null) {
                    mInstance = new MyLazyMode();
                }
            }
        }
        return mInstance;
    }


}
