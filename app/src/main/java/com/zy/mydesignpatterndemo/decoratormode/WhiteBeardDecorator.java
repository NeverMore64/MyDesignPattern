package com.zy.mydesignpatterndemo.decoratormode;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class WhiteBeardDecorator extends Decorator {

    public WhiteBeardDecorator(Actor actor) {
        super(actor);
    }

    private void makeup() {
        System.out.println("白胡须");
    }

    @Override
    public void appearance() {
        makeup();
        super.appearance();
    }
}
