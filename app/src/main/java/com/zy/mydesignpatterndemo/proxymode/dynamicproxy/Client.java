package com.zy.mydesignpatterndemo.proxymode.dynamicproxy;

import com.zy.mydesignpatterndemo.proxymode.RealSubject;
import com.zy.mydesignpatterndemo.proxymode.Subject;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class Client {

    public void main(){
        DynamicProxy dynamicProxy = new DynamicProxy();
        RealSubject realSubject = new RealSubject();
        Subject subject = (Subject) dynamicProxy.newProxyInstance(realSubject);
        //这里会先调用 DynamicProxy 类中的 invoke() 方法，然后再通过该方法中的反射机制来调用被代理对象（RealSubject）的 buy() 方法
        subject.buy();
    }

}
