package com.zy.mydesignpatterndemo.decoratormode;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class WhiteHairDecorator extends Decorator {

    public WhiteHairDecorator(Actor actor) {
        super(actor);
    }

    private void makeup() {
        System.out.println("白头发");
    }

    @Override
    public void appearance() {
        makeup();
        super.appearance();
    }
}
