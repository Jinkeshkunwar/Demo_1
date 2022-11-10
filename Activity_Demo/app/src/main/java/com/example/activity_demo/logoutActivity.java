package com.example.activity_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class logoutActivity extends AppCompatActivity {
    TextView textViewA,textViewB,textViewC;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysecond_main);

        textViewA= findViewById(R.id.textview1);
        textViewB= findViewById(R.id.textView2);
        textViewC= findViewById(R.id.textView3);
        btn1 = findViewById(R.id.logout);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(logoutActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        });
    }
}
