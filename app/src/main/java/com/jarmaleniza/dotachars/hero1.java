package com.jarmaleniza.dotachars;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class hero1 extends AppCompatActivity {
    Intent firstHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero1);
        firstHero = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally{
                    startActivity(firstHero);
                    finish();
                }
            }
        };
        timer.start();
    }
}