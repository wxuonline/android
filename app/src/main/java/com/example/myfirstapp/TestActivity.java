package com.example.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class TestActivity extends AppCompatActivity implements View.OnClickListener {
//    private MyBcReceiver localReceiver;
//    private LocalBroadcastManager localBroadcastManager;
//    private IntentFilter intentFilter;
    private String TAG = "test";

    private Button btn_one;
    private Button btn_two;
    private Button btn_three;
    private Button btn_four;
    private Button btn_five;
    private LinearLayout ly_root;
    private ImageView img_babi;
    private int height;
    private ObjectAnimator animator1;
    private ObjectAnimator animator2;
    private ObjectAnimator animator3;
    private ObjectAnimator animator4;
    private AnimatorSet animSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        bindViews();
        initAnimator();
        Log.d(TAG, "onCreate: 111");


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

    private void bindViews() {
        ly_root = (LinearLayout) findViewById(R.id.ly_root);
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_five = (Button) findViewById(R.id.btn_five);
        img_babi = (ImageView) findViewById(R.id.img_tmall);

        height = ly_root.getHeight();
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_five.setOnClickListener(this);
        img_babi.setOnClickListener(this);

        DisplayUtils utils = new DisplayUtils();
        int transY = utils.dp2px(TestActivity.this, 200);
        img_babi.animate().alpha(0.1f).translationY(transY).setDuration(2000);
    }

    //初始化动画
    private void initAnimator() {
        animator1 = ObjectAnimator.ofFloat(img_babi, "alpha", 1f, 0f, 1f, 0f, 1f);
        animator2 = ObjectAnimator.ofFloat(img_babi, "rotation", 0f, 360f, 0f);
        animator3 = ObjectAnimator.ofFloat(img_babi, "scaleX", 2f, 4f, 1f, 0.5f, 1f);
        animator4 = ObjectAnimator.ofFloat(img_babi, "translationY", height / 8, -100, height / 2);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick");
        switch (view.getId()) {
            case R.id.btn_one:
                animator1.setDuration(3000l);
                animator1.start();
                break;
            case R.id.btn_two:
                animator2.setDuration(3000l);
                animator2.start();
                break;
            case R.id.btn_three:
                animator3.setDuration(3000l);
                animator3.start();
                break;
            case R.id.btn_four:
                animator4.setDuration(3000l);
                animator4.start();
                break;
            case R.id.btn_five:
                //将前面的动画集合到一起~
                animSet = new AnimatorSet();
                animSet.play(animator4).with(animator3).with(animator2).after(animator1);
                animSet.setDuration(5000l);
                animSet.start();
                break;
            case R.id.img_tmall:
                Log.d(TAG, "onClick: 666");
                Toast.makeText(TestActivity.this, "666~", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}







//2020-03-23 https://www.runoob.com/w3cnote/android-tutorial-adapter.html