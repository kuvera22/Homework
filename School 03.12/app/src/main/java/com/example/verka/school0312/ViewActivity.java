package com.example.verka.school0312;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
TextView tvView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        tvView = (TextView) findViewById(R.id.textView);
        Intent intent=getIntent();

        String firstName = intent.getStringExtra("frname");
        String lastName = intent. getStringExtra("lstname");

        tvView.setText("Добро пожаловать, "+ firstName+" "+ lastName);
    }
}
