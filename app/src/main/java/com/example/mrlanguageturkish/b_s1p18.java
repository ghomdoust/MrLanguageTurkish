package com.example.mrlanguageturkish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ir.aghayezaban.mrlanguageturkish.R;

public class b_s1p18 extends AppCompatActivity {

    private TextView tv_s1p18_1 ;
    private TextView tv_s1p18_2 ;
    private TextView tv_s1p18_3 ;
    private TextView tv_s1p18_4 ;
    private TextView tv_s1p18_5 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p18);

        TextView tv_s1p18_1 = findViewById(R.id.tv_s1p18_1);
        TextView tv_s1p18_2 = findViewById(R.id.tv_s1p18_2);
        TextView tv_s1p18_3 = findViewById(R.id.tv_s1p18_3);
        TextView tv_s1p18_4 = findViewById(R.id.tv_s1p18_4);
        TextView tv_s1p18_5 = findViewById(R.id.tv_s1p18_5);


        tv_s1p18_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p18_1 = new Intent (b_s1p18.this,b_s1p18_1.class);
                startActivity(s1p18_1);
            }
        });

        tv_s1p18_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p18_2 = new Intent (b_s1p18.this,b_s1p18_2.class);
                startActivity(s1p18_2);
            }
        });
        tv_s1p18_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p18_3 = new Intent (b_s1p18.this,b_s1p18_3.class);
                startActivity(s1p18_3);
            }
        });
        tv_s1p18_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p18_4 = new Intent (b_s1p18.this,b_s1p18_4.class);
                startActivity(s1p18_4);
            }
        });
        tv_s1p18_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p18_5 = new Intent (b_s1p18.this,b_s1p18_5.class);
                startActivity(s1p18_5);
            }
        });


    }
}
