package com.webmarke8.app.gencart.Activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.webmarke8.app.gencart.R;

import java.util.Observable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Splash extends AppCompatActivity {

    ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



    }

}
