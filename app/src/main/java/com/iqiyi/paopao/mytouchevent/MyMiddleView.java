package com.iqiyi.paopao.mytouchevent;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

@SuppressLint("AppCompatCustomView")
public class MyMiddleView extends FrameLayout implements View.OnClickListener, View.OnTouchListener {
    private static final String TAG = "event";
    public MyMiddleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        Log.d(TAG,"MyImageView init");
        //setOnClickListener(this);
        setOnTouchListener(this);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.d(TAG,"MyMiddleView onInterceptTouchEvent" + event.getAction());
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        Log.d(TAG,"MyMiddleView dispatchTouchEvent" + event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG,"MyMiddleView onTouchEvent" +event.getAction());
        if(event.getAction() == 0) {
            return  true;
        } else {
            return false;
        }
    }

    @Override
    public boolean onTouch(View arg0, MotionEvent event) {
        // TODO Auto-generated method stub
        Log.d(TAG,"MyMiddleView onTouch" + event.getAction());
        return false;
    }

    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        Log.d(TAG,"MyMiddleView onClick");
    }

}
