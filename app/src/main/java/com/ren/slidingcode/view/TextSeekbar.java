package com.ren.slidingcode.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import com.ren.slidingcode.R;

/**
 * Created by asus on 2018/1/31.
 */

class TextSeekbar extends android.support.v7.widget.AppCompatSeekBar {


    private Paint textPaint;

    public TextSeekbar(Context context) {
        super(context);
    }

    public TextSeekbar(Context context, AttributeSet attrs) {
        this(context, attrs, R.style.MySeekbarSytle);
    }

    public TextSeekbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        textPaint = new Paint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        int textSize = Utils.dp2px(context, 14);
        textPaint.setTextSize(textSize);
        textPaint.setAntiAlias(true);
        textPaint.setColor(Color.parseColor("#545454"));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText("向右滑动滑块完成拼图", getWidth() / 2, getHeight() / 2 + textPaint.getTextSize() / 2 - 4, textPaint);
    }
}
