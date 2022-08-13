package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView customardata = (TextView)findViewById(R.id.text1);
        EditText name = (EditText)findViewById(R.id.t);
        EditText age = (EditText)findViewById(R.id.edit3);
        Button next = (Button)findViewById(R.id.button);


             next.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {


                         String x = name.getText().toString();

                         int y = Integer.parseInt(age.getText().toString());


                         Intent thenext = new Intent(MainActivity.this, activity2.class);
                         thenext.putExtra("customer", x);
                         thenext.putExtra("age", y);
                         startActivity(thenext);


                     }


                 });

             }}







