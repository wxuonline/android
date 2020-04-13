package com.example.myfirstapp.broadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d("broadcast", "onReceive: 111111");
        Toast.makeText(context,"网络状态发生改变~",Toast.LENGTH_SHORT).show();
    }
}
