package com.example.vegeken;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HospitalChoosing extends AppCompatActivity {

    private View but1 , but2,but3,but4,but5,but6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_choosing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();


        FloatingActionButton fab = findViewById(R.id.fab);

        but1 = findViewById(R.id.vt2);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HospitalChoosing.this,InformationOfHos.class);
                startActivity(intent);
            }
        });
        but2 =  findViewById(R.id.Ll2);
        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HospitalChoosing.this,InformationOfHos.class);
                startActivity(intent);
            }
        });

        but3 = findViewById(R.id.vt3);
        but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HospitalChoosing.this,InformationOfHos.class);
                startActivity(intent);
            }
        });
        but4 =  findViewById(R.id.Ll3);
        but4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HospitalChoosing.this,InformationOfHos.class);
                startActivity(intent);
            }
        });

        but5 = findViewById(R.id.vt4);
        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HospitalChoosing.this,InformationOfHos.class);
                startActivity(intent);
            }
        });
        but6 =  findViewById(R.id.Ll4);
        but6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HospitalChoosing.this,InformationOfHos.class);
                startActivity(intent);
            }
        });
    }

}
