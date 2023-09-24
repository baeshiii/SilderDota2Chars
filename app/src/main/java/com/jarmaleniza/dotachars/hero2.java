package com.jarmaleniza.dotachars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class hero2 extends AppCompatActivity {
    Intent secondHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero2);
        secondHero = new Intent(this, hero3.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally{
                    startActivity(secondHero);
                    finish();
                }
            }
        };
        timer.start();
    }
}