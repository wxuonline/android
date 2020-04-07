package com.example.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.myfirstapp.common.ActivityCollector;

import java.util.Timer;
import java.util.TimerTask;


public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

//        getSupportActionBar().hide();

        Log.d("BaseActivity", getClass().getSimpleName());


        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    public void AppExit(Context context) {
        try {
            ActivityCollector.finishAll();
            ActivityManager activityMar = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            activityMar.killBackgroundProcesses(context.getPackageName());
            System.exit(0);
            Log.d("exit", "success");
        } catch (Exception ignored) {
            Log.d("exit", "error");
        }
    }


    @Override
    public void onClick(View view) {
        AppExit(TestActivity.this);
    }
}







//2020-03-23 https://www.runoob.com/w3cnote/android-tutorial-adapter.html