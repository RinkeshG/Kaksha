package com.example.rinkesh.kaksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onloginClick(View view) {

        Intent intent = new Intent(this, NewsFeed.class);
        startActivity(intent);
    }
}
