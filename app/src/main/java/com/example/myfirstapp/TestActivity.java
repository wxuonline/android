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
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        getData(new CallBack() {
            @Override
            public void getResult(String result) {
                Log.d(TAG, "getResult: " + result);
            }
        });

//        TestFragment tf = new TestFragment();
//        getSupportFragmentManager().beginTransaction().replace(R.id.frameContain, tf).commit();
//        getSupportFragmentManager().beginTransaction().show(tf);



//        RxPermissions.getInstance(TestActivity.this)
//            .request(Manifest.permission.READ_SMS)
//            .subscribe(new Action1<Boolean>() {
//            @Override
//            public void call(Boolean aBoolean) {
//                if (aBoolean) {//true表示获取权限成功（在android6.0以下默认为true）
//                    Log.d(TAG, "Manifest.permission.READ_SMS 获取成功");
//                    getMsgs(TestActivity.this);
//                } else {
//                    Log.d(TAG, "Manifest.permission.READ_SMS 获取失败");
//                }
//            }
//        });
////        localBroadcastManager = LocalBroadcastManager.getInstance(this);
////        localReceiver = new MyBcReceiver();
////        intentFilter = new IntentFilter();
////        intentFilter.addAction("com.jay.mybcreceiver.LOGIN_OTHER");
////        localBroadcastManager.registerReceiver(localReceiver, intentFilter);
////
//        Button btn = (Button) findViewById(R.id.btn);
//        btn.setOnClickListener(this);
    }

    public interface CallBack {
        public void getResult(String result);
    }

    public void getData(CallBack callBack) {
        String msg = TestActivity.this.getPackageName();
        callBack.getResult(msg);
    }

//    public void getMsgs(Context context) {
//        Uri uri = Uri.parse("content://sms/");
//        Cursor cursor = getContentResolver().query(uri, new String[]{"address", "date", "type", "body"}, null, null, null);
//        while (cursor.moveToNext()) {
//            String address = cursor.getString(0);
//            String date = cursor.getString(1);
//            String type = cursor.getString(2);
//            String body = cursor.getString(3);
//            Log.d(TAG, "getMsgs: address => " + address);
//            Log.d(TAG, "getMsgs: date => " + date);
//            Log.d(TAG, "getMsgs: type => " + type);
//            Log.d(TAG, "getMsgs: body => " + body);
//        }
//        cursor.close();
//    }

    @Override
    public void onClick(View view) {
//        Intent intent = new Intent("com.jay.mybcreceiver.LOGIN_OTHER");
//        localBroadcastManager.sendBroadcast(intent);
//        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
//        intent.addCategory(Intent.CATEGORY_OPENABLE);
//        intent.setType("image/*");
//        startActivity(intent);
        Intent it = new Intent();
//        it.setAction(Intent.ACTION_MAIN);
//        it.addCategory(Intent.CATEGORY_HOME);
//        it.setAction(Intent.ACTION_VIEW);
//        it.setData(Uri.parse("http://www.baidu.com"));
        it.setAction("my_action");
        it.addCategory("my_category");
        startActivity(it);
    }
}







//2020-03-23 https://www.runoob.com/w3cnote/android-tutorial-adapter.html