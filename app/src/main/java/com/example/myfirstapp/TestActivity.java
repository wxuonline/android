package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);







//        ImageView imgPgbar = (ImageView) findViewById(R.id.image);
//        final AnimationDrawable animation = (AnimationDrawable) imgPgbar.getDrawable();
//        imgPgbar.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                animation.start();
//            }
//        }, 100);
//        final TextView btn1 = (TextView) findViewById(R.id.one);
//        final TextView btn2 = (TextView) findViewById(R.id.two);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (btn2.getText().toString().equals("按钮不可用")) {
//                    btn1.setEnabled(false);
//                    btn2.setText("按钮可用");
//                } else {
//                    btn1.setEnabled(true);
//                    btn2.setText("按钮不可用");
//                }
//            }
//        });
//        text2.setFocusable(true);
//        text2.setFocusableInTouchMode(true);
//        text2.requestFocus();
//        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
//        text2.setSelected(true);
//        text2.setMovementMethod(LinkMovementMethod.getInstance());
//        String str = "红色打电话斜体删除线绿色下划线图片:.";
//        SpannableString span = new SpannableString(str);
////        span.setSpan(new URLSpan("tel:13400894943"), 2, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        span.setSpan(new ClickableSpan() {
//            @Override
//            public void onClick(View widget) {
//                System.out.println("666");
//                Toast.makeText(getApplicationContext(),"Love",Toast.LENGTH_SHORT).show();
//            }
//            @Override
//            public void updateDrawState(TextPaint ds) {
//                super.updateDrawState(ds);
//                ds.setColor(Color.BLUE);
//                ds.setUnderlineText(false);
//            }
//        }, 2, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        text2.setText(span);
    }
}







//2020-03-13 https://www.runoob.com/w3cnote/android-tutorial-edittext.html