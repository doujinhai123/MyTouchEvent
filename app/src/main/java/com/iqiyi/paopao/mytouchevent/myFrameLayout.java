package com.iqiyi.paopao.mytouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;


public class myFrameLayout extends FrameLayout implements View.OnClickListener, View.OnTouchListener {
    public final String TAG = "event";

    public myFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        Log.d(TAG, "MyFrameLayout init");
       // setOnClickListener(this);
        setOnTouchListener(this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d(TAG,"MyFrameLayout dispatchTouchEvent"+ event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.d(TAG,"MyFrameLayout onInterceptTouchEvent" +event.getAction());
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
      //  return true;
        Log.d(TAG,"MyFrameLayout onTouchEvent" + event.getAction());
        return super.onTouchEvent(event);
    }

    @Override
    public void onClick(View view) {
        // TODO Auto-generated method stub
        Log.d(TAG,"MyFrameLayout onClick");
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        // TODO Auto-generated method stub
        Log.d(TAG,"MyFrameLayout onTouch"+event.getAction());
        return false;
    }

}
