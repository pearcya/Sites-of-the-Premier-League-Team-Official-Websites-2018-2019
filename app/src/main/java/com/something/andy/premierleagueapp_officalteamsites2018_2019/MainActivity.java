package com.something.andy.premierleagueapp_officalteamsites2018_2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread timer = new Thread(){
            public void run(){
                try{

                    sleep(5000);
                }catch (InterruptedException e){

                }finally {
                    Intent teams = new Intent("android.intent.action.PICKINGTEAM");
                    startActivity(teams);
                }
            }
        };
        timer.start();

    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}


