package com.example.verka.stopwatch;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {
private int seconds;
    private boolean running;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runTimer();
    }

    public void onClickReset(View view) {
        seconds=0;
        running=false;
    }

    public void onClickStop(View view) {
        running=false;
    }

    public void onClickStart(View view) {
        running=true;
    }
    private void runTimer(){
        final TextView textView = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = (seconds%3600)/3600;
               int minutes= seconds/3600 ;
                int secon = (seconds%3600)/60;
                int mili = seconds%60;

                String time = String.format("%02d:%02d:%02d:%02d",hours, minutes, secon, mili);
                textView.setText(time);
                if (running){
                    seconds++;
                }
                handler.postDelayed(this, 10);
            }
        });
    }


}
