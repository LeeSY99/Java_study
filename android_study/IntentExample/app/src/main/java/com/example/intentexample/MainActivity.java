package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test=findViewById(R.id.et_test);


        btn_move=findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=et_test.getText().toString(); //텍스트창에 적은걸 불러옴
                Intent intent = new Intent(MainActivity.this,SubActivity.class);//클릭하면 인텐트 생성. this->sub로
                intent.putExtra("str",str); //name를 본인이 입력하는게 아님, 입력받은값을 가지고 감
                startActivity(intent);//액티비티 이동
            }
        });

    }
}