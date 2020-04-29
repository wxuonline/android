package com.example.myfirstapp.test;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.example.myfirstapp.R;

public class PaintView extends View {
    private Paint paint;
    public float X = 50;
    public float Y = 50;

    public PaintView(Context context) {
        super(context);
        init();
    }

    public PaintView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PaintView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.blue));
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(36);
        paint.setStrokeWidth(5);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(getResources().getColor(R.color.colorGray));
//        canvas.drawCircle(200, 200, 100, paint);
//        canvas.drawRect(0, 0, 200, 100, paint);
//        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.tmall), 100, 100, paint);
//        canvas.drawArc(new RectF(0, 0, 100, 100), 0, 90, false, paint);
//        canvas.drawRoundRect(new RectF(30, 10, 210, 110), 15, 15, paint);
//        canvas.drawOval(new RectF(20, 20, 420, 220), paint);
//        Path path = new Path();
//        path.moveTo(10, 10); //移动到 坐标10,10
//        path.lineTo(100, 50);
//        path.lineTo(200,40);
//        path.lineTo(300, 20);
//        path.lineTo(200, 10);
//        path.lineTo(100, 70);
//        path.lineTo(50, 40);
//        path.close();
//        canvas.drawPath(path,paint);
//        canvas.drawText("打死了氯硝西泮手动阀", 50, 50, paint);
//        Path path = new Path();
//        path.moveTo(50,50);
//        path.lineTo(100, 100);
//        path.lineTo(200, 200);
//        path.lineTo(300, 300);
//        path.close();
//        canvas.drawTextOnPath("了开始打点哦is都流口水啊啊是", path, 50, 50, paint);    //绘制文字

    }
}
