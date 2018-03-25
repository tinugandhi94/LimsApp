package com.example.tinug.limsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
    }

    public void nextActivity1(View view) {
        Intent in1 = new Intent(this,StudentDrawer.class);
        startActivity(in1);
    }

    public void nextActivity2(View view) {
        Intent in2 = new Intent(this,LoginActivity.class);
        startActivity(in2);
    }


}
