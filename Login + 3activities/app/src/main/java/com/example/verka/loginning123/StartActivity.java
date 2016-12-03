package com.example.verka.loginning123;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {
    Button button1;
    TextView textView;
    EditText login;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button1= (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView2);
        login = (EditText) findViewById(R.id.editText);
        password=(EditText) findViewById(R.id.editText2);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if ((login.getText().toString().equals("1")) && (password.getText().toString().equals("2"))){
                    Intent intent = new Intent(StartActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                else{
                    textView.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}