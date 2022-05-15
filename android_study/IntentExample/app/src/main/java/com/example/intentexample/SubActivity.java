package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub=findViewById(R.id.tv_sub);

        Intent intent= getIntent(); //다른곳에서 날아오는 데이터를 받음
        String str= intent.getStringExtra("str");

        tv_sub.setText(str);
    }
}