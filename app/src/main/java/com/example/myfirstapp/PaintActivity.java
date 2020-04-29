package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myfirstapp.test.PaintView;

public class PaintActivity extends AppCompatActivity {
//    private TextView paintView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);

//        paintView = (TextView) findViewById(R.id.paintView);
//        PaintView paint = new PaintView(PaintActivity.this);

    }
}
