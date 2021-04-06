package com.example.mrlanguageturkish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ir.aghayezaban.mrlanguageturkish.R;

public class b_s1p1 extends AppCompatActivity {

    private TextView tv_s1p1_1 ;
    private TextView tv_s1p1_2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p1);

        TextView tv_s1p1_1 = findViewById(R.id.tv_s1p1_1);
        TextView tv_s1p1_2 = findViewById(R.id.tv_s1p1_2);

        tv_s1p1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p1_1 = new Intent (b_s1p1.this,b_s1p1_1.class);
                startActivity(s1p1_1);
            }
        });

        tv_s1p1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p1_2 = new Intent (b_s1p1.this,b_s1p1_2.class);
                startActivity(s1p1_2);
            }
        });

    }
}
