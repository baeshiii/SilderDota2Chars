package com.jarmaleniza.dotachars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
public class hero7 extends AppCompatActivity {
Intent seventhHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero7);
        seventhHero = new Intent(this, hero8.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally{
                    startActivity(seventhHero);
                    finish();
                }
            }
        };
        timer.start();
    }
}