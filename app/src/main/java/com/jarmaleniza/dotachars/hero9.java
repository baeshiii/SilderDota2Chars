package com.jarmaleniza.dotachars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
public class hero9 extends AppCompatActivity {
Intent ninthHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero9);
        ninthHero = new Intent(this, hero10.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally{
                    startActivity(ninthHero);
                    finish();
                }
            }
        };
        timer.start();
    }
}