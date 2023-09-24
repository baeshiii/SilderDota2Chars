package com.jarmaleniza.dotachars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

public class hero5 extends AppCompatActivity {
Intent fifthHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero5);
        fifthHero = new Intent(this, hero6.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally{
                    startActivity(fifthHero);
                    finish();
                }
            }
        };
        timer.start();
    }
}