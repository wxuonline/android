package com.example.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.Manifest;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myfirstapp.broadcastReceiver.MyBcReceiver;
import com.example.myfirstapp.common.ActivityCollector;
import com.tbruyelle.rxpermissions.RxPermissions;

import java.util.Timer;
import java.util.TimerTask;

import rx.functions.Action1;


public class TestActivity extends AppCompatActivity implements View.OnClickListener {
//    private MyBcReceiver localReceiver;
//    private LocalBroadcastManager localBroadcastManager;
//    private IntentFilter intentFilter;
    private String TAG = "test";
    private ImageView imgView;
    private AnimationDrawable ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        imgView = (ImageView) findViewById(R.id.loading);
        ad = (AnimationDrawable) imgView.getDrawable();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ad.start();
            }
        }, 300);




//        getData(new CallBack() {
//            @Override
//            public void getResult(String result) {
//                Log.d(TAG, "getResult: " + result);
//            }
//        });
    }

//    public interface CallBack {
//        public void getResult(String result);
//    }
//
//    public void getData(CallBack callBack) {
//        String msg = TestActivity.this.getPackageName();
//        callBack.getResult(msg);
//    }

    @Override
    public void onClick(View view) {
    }
}







//2020-03-23 https://www.runoob.com/w3cnote/android-tutorial-adapter.html