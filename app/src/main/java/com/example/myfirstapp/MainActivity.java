package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myfirstapp.broadcastReceiver.MyReceiver;
import com.example.myfirstapp.services.TestIntentService;
import com.example.myfirstapp.ui.login.LoginActivity;
import com.tbruyelle.rxpermissions.RxPermissions;

import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.mainstay.MESSAGE";
    MyReceiver myReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent it = new Intent(MainActivity.this, com.example.myfirstapp.services.TestIntentService.class);
        it.setAction("com.example.myfirstapp.action.BAZ");
        startService(it);

//        渐变动画
        ImageView img = (ImageView) findViewById(R.id.imageView);
        TransitionDrawable td = (TransitionDrawable) img.getDrawable();
        td.startTransition(3000);




//        注册广播
        myReceiver = new MyReceiver();
        IntentFilter itFilter = new IntentFilter();
        itFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(myReceiver, itFilter);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {

        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

//        TextView testier = (TextView) findViewById(R.id.textView11);
//        ObjectAnimator animation1 = ObjectAnimator.ofFloat(testier, "scaleX", 2f, 4f, 1f, 0.5f, 1f);
//        animation1.setDuration(2000);
//        animation1.start();
//        ValueAnimator animation = ValueAnimator.ofFloat(0f, 100f);
//        animation.setDuration(1000);
//        animation.start();
//        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.property_animator);
//        set.setTarget(myObject);
//        set.start();
    }
    public void openActivity(View view) {
//        Intent intent = new Intent(this, NewsActivity.class);
        Intent intent = new Intent(this, TestActivity.class);
//        Intent intent = new Intent(this, LoginActivity.class);
//        Intent intent = new Intent(this, PaintActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_show, R.anim.anim_hide);

        Toast.makeText(getApplicationContext(),"Love",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myReceiver);
    }

    public  static void isNetworkAvailable() {

    }
}
