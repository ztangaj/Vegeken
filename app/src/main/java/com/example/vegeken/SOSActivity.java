package com.example.vegeken;

import android.graphics.SurfaceTexture;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.hardware.Camera;

import java.io.IOException;

public class SOSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void startAlarm(View view){
//        for(int i=0; i<100; i++){
//            flashOn();
//            try{
//                Thread.currentThread().sleep(500);
//            } catch (Exception e){}
//            flashOff();
//            try{
//                Thread.currentThread().sleep(500);
//            } catch (Exception e){}
//        }
//        Camera camera;
//        camera=Camera.open();
//        Camera.Parameters parameters=camera.getParameters();
//        try {
//            camera.setPreviewTexture(new SurfaceTexture(0));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
//        camera.setParameters(parameters);
//        camera.startPreview();
    }

    public void flashOn(){



    }

//    public void flashOff(){
//        try{
//            Camera.Parameters mParameters;
//            mParameters = camera.getParameters();
//            mParameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
//            camera.setParameters(mParameters);
//            camera.release();
//        } catch(Exception ex){}
//
//    }
}
