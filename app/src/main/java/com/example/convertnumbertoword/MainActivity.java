package com.example.convertnumbertoword;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = (TextView) findViewById(R.id.result);
        EditText number = (EditText) findViewById(R.id.Number);


        Button btnConvert = (Button) findViewById(R.id.buttonCLK);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayNumberToWord.class);
                NumberToWord words = new NumberToWord();
                int  x = parseInt(number.getText().toString());
                result.setText(words.convert(x));
                intent.putExtra("Result", x);
                startActivity(intent);
            }
        });
    }

    public static class NumberToWord
    {
        public static String[] words = {"","One", "Two", "Three", "Four", "Five", "Six","Seven","Eight","Nine"};

        public String convert(int n){
            if(n==0){
                return "Zero";
            }

            if(n<=9){
                return words[n];
            }

    return "out of range";
        }
        }
    }


