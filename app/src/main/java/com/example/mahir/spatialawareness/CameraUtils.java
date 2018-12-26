package com.example.mahir.spatialawareness;

import android.content.Context;
import android.content.pm.PackageManager;


public class CameraUtils {
    public boolean checkCameraHardware(Context context){
        if(context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            //this device has a camera
            return true;
        } else{
            //no camera on this device
            return false;
        }
    }
}
