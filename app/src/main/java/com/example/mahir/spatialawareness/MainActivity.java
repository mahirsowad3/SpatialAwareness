package com.example.mahir.spatialawareness;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private Camera mCamera;
    private CameraPreview mPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCamera = Camera.open();

        mPreview = new CameraPreview(this, mCamera);
        FrameLayout preview = findViewById(R.id.preview);
        preview.addView(mPreview);
    }
}
