package com.example.lottieanimation;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        Thread thread=new Thread(){
            @Override
            public void run() {
                try{
                    sleep(8000);

                }catch (Exception e){
                    e.printStackTrace();
            }finally {
                    Intent intent= new Intent(WelcomeActivity.this,MainActivity.class);

                    startActivity(intent);
                }
                }
        };
        thread. start();

    }


    }
