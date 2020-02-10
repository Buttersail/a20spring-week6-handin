package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contact extends AppCompatActivity implements View.OnClickListener{

    private Button btn_about, btn_mainPage, btn_complain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        btn_about = findViewById(R.id.about);
        btn_about.setOnClickListener(this);
        btn_mainPage = findViewById(R.id.mainPage);
        btn_mainPage.setOnClickListener(this);
        btn_complain = findViewById(R.id.complain);
        btn_complain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.about:
                Intent intent_about = new Intent(this, About.class);
                startActivity(intent_about);
                break;
            case R.id.complain:
                Intent intent_complain = new Intent(this, Complain.class);
                startActivity(intent_complain);
                break;
            case R.id.mainPage:
                Intent intent_mainPage = new Intent(this, MainActivity.class);
                startActivity(intent_mainPage);

        }
    }
}
