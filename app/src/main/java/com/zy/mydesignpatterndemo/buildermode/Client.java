package com.zy.mydesignpatterndemo.buildermode;

import android.content.Context;

/**
 * create by zy on 2020/7/1
 * </p>
 */
public class Client {

    private Context context;

    public void main(){
        new MyConfirmDialog(context).builder().setTitle("")
                .setMsg("")
                .show();
    }

}
