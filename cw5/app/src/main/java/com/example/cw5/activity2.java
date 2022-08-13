package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        TextView name1 = (TextView)findViewById(R.id.textView);
        TextView haneen = (TextView)findViewById(R.id.textView2);
        TextView age = (TextView)findViewById(R.id.textView3);
        TextView s = (TextView)findViewById(R.id.textView4);

        Bundle b = getIntent().getExtras();
        String h = b.getString("customer");
        haneen.setText(h);
        int v = b.getInt("age");
        s.setText(String.valueOf(v));



    }
}