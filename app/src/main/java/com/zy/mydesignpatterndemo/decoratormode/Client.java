package com.zy.mydesignpatterndemo.decoratormode;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class Client {

    public static void main(String[] args){
        // 没化妆的小明
        Actor component = new ActorXiaoMing();
        // 给小明画了白头发
        component = new WhiteHairDecorator(component);
        // 给小明画了白胡须
        component = new WhiteBeardDecorator(component);
        //化完妆要出场了
        component.appearance();
    }

}
