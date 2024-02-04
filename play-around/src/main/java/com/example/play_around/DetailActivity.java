package com.example.play_around;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textView = findViewById(R.id.textView);
        Intent recievedIntent = getIntent();
        if(recievedIntent != null){
            String data = recievedIntent.getStringExtra("number");
            textView.setText(data);
        }
    }
}