package com.example.verka.school0312;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
EditText fName;
    EditText lName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fName = (EditText) findViewById(R.id.editText3);
        lName = (EditText) findViewById(R.id.editText4);
        Button buttonSubmit = (Button) findViewById(R.id.button2);
        buttonSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent= new Intent(this, ViewActivity.class);
        intent.putExtra("frname", fName.getText().toString());
        intent.putExtra("lstname", lName.getText().toString());
        startActivity(intent);
    }
}
