package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity implements View.OnClickListener{

    private Button btn_complain, btn_mainPage, btn_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btn_complain = findViewById(R.id.complain);
        btn_complain.setOnClickListener(this);
        btn_mainPage = findViewById(R.id.mainPage);
        btn_mainPage.setOnClickListener(this);
        btn_contact = findViewById(R.id.contact);
        btn_contact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.contact:
                Intent intent_contact = new Intent(this, Contact.class);
                startActivity(intent_contact);
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
