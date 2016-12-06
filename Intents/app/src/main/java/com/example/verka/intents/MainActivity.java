package com.example.verka.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMap(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:55.754283,37.62002?q=restaraunte"));
        startActivity(intent);
    }
    public void Camera(View view){
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(cameraIntent);
    }
    public void Site(View view){
        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.samsung.com"));
        startActivity(intent2);
    }
    public void Call(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("tel:89152057972"));
        startActivity(intent);
    }
    public void Message(View view){
        Intent smsIntent = new Intent(Intent.ACTION_VIEW);
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.putExtra("sms_body","");
        startActivity(smsIntent);
    }
    public void ExitAll(View view){
        System.exit(0);
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void Exit(View view){
       finishAffinity();
    }
}
