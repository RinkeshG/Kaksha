package com.example.rinkesh.kaksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rinkesh.kaksha.Fragment.fragment_login;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void onNextClick(View view) {

        Intent intent = new Intent(this, fragment_login.class);
        startActivity(intent);
        finish();
    }
}
