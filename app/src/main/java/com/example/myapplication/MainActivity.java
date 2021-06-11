package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView data,web,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data=(ImageView)findViewById(R.id.data);
        web=(ImageView)findViewById(R.id.web);
        mobile=(ImageView)findViewById(R.id.mobile);


        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("web","Front-End web development");
                intent.putExtra("description","We offer 4year web design courses which equip students with necessary knowledge");
                startActivity(intent);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("web","Mobile Device Programming");
                intent.putExtra("description","We offer Online Courses such as Mobile Device Programming");
                startActivity(intent);
            }
        });
        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("web","Data Science");
                intent.putExtra("description","This Course is a 3year Course. This School has produced thousands of Data scientists across the globe");
                startActivity(intent);
            }
        });
    }
}