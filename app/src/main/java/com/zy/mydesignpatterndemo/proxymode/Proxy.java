package com.zy.mydesignpatterndemo.proxymode;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class Proxy implements Subject {
    @Override
    public void buy() {
        // 创建被代理的对象
        RealSubject realSubject = new RealSubject();
        // 购买东西
        realSubject.buy();
        // 邮寄
        post();
    }

    public void post() {
        System.out.println("将买好的东西邮寄给买家");
    }

}
