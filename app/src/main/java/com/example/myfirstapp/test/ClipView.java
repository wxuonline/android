package com.example.myfirstapp.test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;

import com.example.myfirstapp.R;

public class ClipView extends View {

    private Bitmap mBitmap = null;
    private int limitLength = 0;     //
    private int width;
    private int heigth;
    private static final int CLIP_HEIGHT = 50;

    private boolean status = HIDE;//显示还是隐藏的状态，最开始为HIDE
    private static final boolean SHOW = true;//显示图片
    private static final boolean HIDE = false;//隐藏图片

    public ClipView(Context context) {
        super(context);
    }

    public ClipView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.tmall);
        limitLength = width = mBitmap.getWidth();
        heigth = mBitmap.getHeight();
    }

    public ClipView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        int i = 0;
        while (i * CLIP_HEIGHT <= heigth) {//计算clip的区域
            if (i % 2 == 0) {
                path.addRect(new RectF(0,i*CLIP_HEIGHT, limitLength,(i+1)*CLIP_HEIGHT),Path.Direction.CCW);;
//                path.addRect(new RectF(0, i * CLIP_HEIGHT, limitLength, (i + 1) * CLIP_HEIGHT));
            } else {
                path.addRect(new RectF(width,i*CLIP_HEIGHT,width-limitLength,(i+1)*CLIP_HEIGHT),Path.Direction.CCW);
//                region.union(new Rect(width - limitLength, i * CLIP_HEIGHT, width, (i + 1) * CLIP_HEIGHT));
            }
            i++;
        }
        canvas.clipPath(path);
        canvas.drawBitmap(mBitmap, 0, 0, new Paint());
        if (status == HIDE) {//如果此时是隐藏
            limitLength -= 10;
            if(limitLength <= 0)
                status=SHOW;
        } else {//如果此时是显示
            limitLength += 5;
            if(limitLength >= width)
                status=HIDE;
        }
        postInvalidate();
    }
}
