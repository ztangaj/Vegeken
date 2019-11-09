package com.example.vegeken;


import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;

import android.hardware.camera2.CameraManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.view.View;


public class SOSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        FloatingActionButton fab = findViewById(R.id.fab);

    }

    public void openNewTip(View view){
        Intent intent = new Intent(this, FakeTipActivity.class);
        startActivity(intent);
    }

    int alarmFlag = 0;

    private CameraManager cameraManager;
    private String cameraId;

    private MediaPlayer mp;

    @TargetApi(23)
    public void startOrStopAlarm(View view){

        if(alarmFlag==0){
            try {
                cameraManager = (CameraManager)getSystemService(Context.CAMERA_SERVICE);
                cameraId = cameraManager.getCameraIdList()[0];
                cameraManager.setTorchMode(cameraId, true);
                alarmFlag = 1;
                mp = MediaPlayer.create(this, R.raw.alarm);
                if(!mp.isPlaying()){
                    mp.start();
                    mp.setLooping(true);
                }
            } catch (Exception e){}
        }
        else{
            try {
                cameraManager = (CameraManager)getSystemService(Context.CAMERA_SERVICE);
                cameraId = cameraManager.getCameraIdList()[0];
                cameraManager.setTorchMode(cameraId, false);
                alarmFlag = 0;
                mp.reset();
                mp.release();
            } catch (Exception e){}
        }
    }

}