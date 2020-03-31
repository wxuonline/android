package com.example.myfirstapp.common;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class BtnClickListener implements View.OnClickListener {
    private Context mContext;

    public BtnClickListener(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(mContext, "你点击了按钮2", Toast.LENGTH_SHORT).show();
    }
}
