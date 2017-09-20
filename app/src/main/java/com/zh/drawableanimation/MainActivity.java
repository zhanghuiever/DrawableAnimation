package com.zh.drawableanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mWifiImage;
    private ImageView mLoadingImage;

    private AnimationDrawable mWifiAnimation;
    private AnimationDrawable mLoadingAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWifiImage = (ImageView) findViewById(R.id.iv_wifi);
        mLoadingImage = (ImageView) findViewById(R.id.iv_loading);

        mWifiImage.setBackgroundResource(R.drawable.icon_wifi);
        mWifiAnimation = (AnimationDrawable)mWifiImage.getBackground();

        mLoadingImage.setImageResource(R.drawable.icon_loading);
        mLoadingAnimation = (AnimationDrawable) mLoadingImage.getDrawable();
        mLoadingAnimation.start();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        mWifiAnimation.start();
    }

    public void startWifiAnimation(View view){
        if(mWifiAnimation != null){
            mWifiAnimation.start();
        }
        if(mLoadingAnimation != null){
            mLoadingAnimation.start();
        }
    }

    public void stopWifiAnimation(View view){
        if(mWifiAnimation != null){
            Log.i("cydia", "animation is running?  " +mWifiAnimation.isRunning());
            mWifiAnimation.stop();
        }
        if(mLoadingAnimation != null){
            mLoadingAnimation.stop();
        }
    }
}
