package com.example.vegeken;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationOfHos extends AppCompatActivity {
    private Button navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_of_hos);
        navigation = findViewById(R.id.navigation);
        navigation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationOfHos.this, HospitalChoosing.class);
                startActivity(intent);
            }
        });
    }
}
