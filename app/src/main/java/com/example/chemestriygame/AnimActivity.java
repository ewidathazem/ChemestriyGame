package com.example.chemestriygame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AnimActivity extends AppCompatActivity {

    private Animation anim;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim );
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        anim = AnimationUtils.loadAnimation(this, R.anim.first_animation);
        img = findViewById(R.id.img);
        img.setAnimation(anim);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AnimActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
