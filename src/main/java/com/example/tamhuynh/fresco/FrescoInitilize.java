package com.example.tamhuynh.fresco;

import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by tamhuynh on 1/29/16.
 */
public class FrescoInitilize {

    public static void initilizeFresco(Context context){
        Fresco.initialize(context);
    }
}
