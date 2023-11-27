package com.codewithmomin.counterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView wellcome_text,Counter_text;
    Button myBtn1,myBtn2;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn1=findViewById(R.id.btn1);
        myBtn2=findViewById(R.id.btn2);
        wellcome_text=findViewById(R.id.wellcometext);
        Counter_text=findViewById(R.id.countertext);

            // Adding functionalities
        myBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter_text.setText(" "+increaseCounterBy1());
                Toast.makeText(MainActivity.this, "Keep Going Daddy", Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "ahhh ahhh", Toast.LENGTH_SHORT).show();
            }
        });


        myBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Counter_text.setText(""+increaseCounterBy10());
            }
        });

    }
    public int increaseCounterBy1()
    {
            return ++counter;
    }
    public int increaseCounterBy10()
    {
        return counter=counter+10;
    }
}