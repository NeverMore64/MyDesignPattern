package com.zy.mydesignpatterndemo.decoratormode;

/**
 * create by zy on 2020/7/2
 * </p>
 */
public class Decorator implements Actor {

    private Actor mActor = null;

    public Decorator(Actor actor) {
        this.mActor = actor;
    }

    @Override
    public void appearance() {
        mActor.appearance();
    }

}
