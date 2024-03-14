package com.example.convertnumbertoword;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

public class DisplayNumberToWord extends AppCompatActivity {
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_number_to_word);
        result = findViewById(R.id.result);
        String Result = getIntent().getStringExtra("Result");
        result.setText(Result);
    }
}
