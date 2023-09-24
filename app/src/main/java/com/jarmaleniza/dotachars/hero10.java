package com.jarmaleniza.dotachars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class hero10 extends AppCompatActivity {
Intent tenthHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero10);
        tenthHero = new Intent(this, hero11.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally{
                    startActivity(tenthHero);
                    finish();
                }
            }
        };
        timer.start();
    }
}