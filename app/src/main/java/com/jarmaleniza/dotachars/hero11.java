package com.jarmaleniza.dotachars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class hero11 extends AppCompatActivity {
Intent eleventhHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero11);
        eleventhHero = new Intent(".MainActivity");
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally{
                    startActivity(eleventhHero);
                    finish();
                }
            }
        };
        timer.start();
    }
}