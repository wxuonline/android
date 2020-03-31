package com.example.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myfirstapp.common.BtnClickListener;


public class TestActivity extends AppCompatActivity {
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        btn = (Button) findViewById(R.id.btn);
    }

    public void myClick(View view) {
        Toast.makeText(TestActivity.this, "你点击了按钮4", Toast.LENGTH_SHORT).show();
    }


}







//2020-03-23 https://www.runoob.com/w3cnote/android-tutorial-adapter.html