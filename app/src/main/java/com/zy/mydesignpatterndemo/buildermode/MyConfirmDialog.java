package com.zy.mydesignpatterndemo.buildermode;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * create by zy on 2020/7/1
 * </p>
 */
public class MyConfirmDialog {

    private AlertDialog dialog;
    private TextView tvTitle;
    private TextView tvMsg;
    private Context context;

    public MyConfirmDialog(Context context) {
        this.context = context;
    }

    public MyConfirmDialog builder() {
        dialog = new AlertDialog.Builder(context).create();
        tvTitle = new TextView(context);
        tvMsg = new TextView(context);
        return this;
    }

    public MyConfirmDialog setTitle(String title) {
        tvTitle.setText(title);
        return this;
    }

    public MyConfirmDialog setMsg(String msg) {
        tvMsg.setText(msg);
        return this;
    }

    public void show() {
        if (context instanceof Activity && ((Activity) context).isFinishing())
            return;
        if (dialog != null) {
            dialog.show();
            WindowManager.LayoutParams params = dialog.getWindow().getAttributes();
//            params.width = (int) (DensityUtil.getScreenWidth() * 0.83);
//            params.height = LinearLayout.LayoutParams.WRAP_CONTENT;
            dialog.getWindow().setAttributes(params);
        }
    }

}
