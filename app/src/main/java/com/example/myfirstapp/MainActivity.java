package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.tbruyelle.rxpermissions.RxPermissions;

import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.mainstay.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Love",Toast.LENGTH_SHORT).show();
    }
}
