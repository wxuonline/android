package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.example.myfirstapp.common.Animal;
import com.example.myfirstapp.common.Data;
import com.example.myfirstapp.common.MyAdapter;
//import com.example.myfirstapp.common.AnimalAdapter;

import java.util.LinkedList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
    private List<Data> mData = null;
    private Context mContext;
    private MyAdapter mAdapter = null;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mContext = TestActivity.this;
        bindViews();
        mData = new LinkedList<Data>();
        mAdapter = new MyAdapter(mContext, (LinkedList<Data>) mData);
        listView.setAdapter(mAdapter);


    }

    private void bindViews() {
        listView = (ListView) findViewById(R.id.listView);
    }

}







//2020-03-23 https://www.runoob.com/w3cnote/android-tutorial-adapter.html