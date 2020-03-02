package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText txt1, txt2;
    String v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            txt1 = findViewById(R.id.editText1);
            txt1 = findViewById(R.id.editText2);
            btn = findViewById(R.id.okbtn);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v1 = txt1.getText().toString();
                v2 = txt2.getText().toString();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("value1", v1);
                intent.putExtra("value2", v2);
                startActivity(intent);
            }
        });
    }