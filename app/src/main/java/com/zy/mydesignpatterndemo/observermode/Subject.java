package com.zy.mydesignpatterndemo.observermode;

import java.util.ArrayList;
import java.util.List;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public abstract class Subject {

    // 定义一个观察者数组
    private List<Observer> list = new ArrayList<>();

    // 增加一个观察者
    public void addObserver(Observer o){
        this.list.add(o);
    }

    // 删除一个观察者
    public void delObserver(Observer o){
        this.list.remove(o);
    }

    public void notifyObservers(){
        for (Observer observer : list) {
            observer.update();
        }
    }


}
