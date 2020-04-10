package com.example.myfirstapp.services;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.example.myfirstapp.MainActivity;
import com.example.myfirstapp.R;

public class TestIntentService extends IntentService {
    private static final String ACTION_FOO = "com.example.myfirstapp.action.FOO";
    private static final String ACTION_BAZ = "com.example.myfirstapp.action.BAZ";
    private static final String EXTRA_PARAM1 = "com.example.myfirstapp.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.example.myfirstapp.extra.PARAM2";

    public static String CHANNEL_ID = "com.example.recyclerviewtest.N1";
    public static String CHANNEL_NAME = "TEST";
    private static final String TAG = TestIntentService.class.getSimpleName();
    public static boolean serviceIsLive;
    private int NOTIFICATION_ID = 111;

    public TestIntentService() {
        super("TestIntentService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");

        NotificationManager manager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder;
        //判断是否是8.0Android.O
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel chan1 = new NotificationChannel("static", "Primary Channel", NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(chan1);
            builder = new NotificationCompat.Builder(this, "static");
        } else {
            builder = new NotificationCompat.Builder(this);
        }

        builder.setDefaults(NotificationCompat.DEFAULT_SOUND);//设置通知铃声
        Notification notification = builder.setTicker("您有新的消息")
                .setDefaults(Notification.DEFAULT_ALL)
                .setSmallIcon(R.mipmap.jd)
                .setWhen(System.currentTimeMillis())
                .setContentTitle("标题标题标题标题标")
                .setContentText("内容内容内容内容内容内容")
                .setAutoCancel(true)
                .build();

        startForeground(110, notification);
    }


    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, TestIntentService.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    public static void startActionBaz(Context context, String param1, String param2) {
        Intent intent = new Intent(context, TestIntentService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        if (intent != null) {
//            final String action = intent.getAction();
//            System.out.println(action);
//            if (ACTION_FOO.equals(action)) {
//                System.out.println(1);
//                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
//                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
//                handleActionFoo(param1, param2);
//            } else if (ACTION_BAZ.equals(action)) {
//                System.out.println(2);
//                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
//                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
//                handleActionBaz(param1, param2);
//            }
//        }
    }

    private void handleActionFoo(String param1, String param2) {
        System.out.println(1.2);
//        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void handleActionBaz(String param1, String param2) {
        System.out.println(2.2);
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}
