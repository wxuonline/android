package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView text2 = (TextView) findViewById(R.id.two);
        text2.setMovementMethod(LinkMovementMethod.getInstance());
        String str = "红色打电话斜体删除线绿色下划线图片:.";
        SpannableString span = new SpannableString(str);
        span.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                System.out.println("666");
                Toast.makeText(getApplicationContext(),"Love",Toast.LENGTH_SHORT).show();
            }
        }, 2, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text2.setText(span);
    }
}
//2020-03-13 https://www.runoob.com/w3cnote/android-tutorial-textview.html