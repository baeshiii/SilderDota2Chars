package com.jarmaleniza.dotachars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
public class hero8 extends AppCompatActivity {
Intent eightHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero8);
        eightHero = new Intent(this, hero9.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally{
                    startActivity(eightHero);
                    finish();
                }
            }
        };
        timer.start();
    }
}