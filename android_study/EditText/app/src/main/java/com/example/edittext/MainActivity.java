package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_id=findViewById(R.id.et_id);     //id로 찾기
        btn_test=findViewById(R.id.btn_test);

        btn_test.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_id.setText("이상윤");   //아무거나 입력했어도 버튼(btn_test)을 누르면 설정된 값으로 변함
            }
        }));
    }
}