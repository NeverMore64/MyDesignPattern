package com.zy.mydesignpatterndemo.proxymode;

/**
 * create by zy on 2020/7/2
 * 静态代理需要在实现阶段就知道被代理的对象。
 */
public class Client {

    public void main() {
        Subject proxy = new Proxy();
        proxy.buy();
    }

}
