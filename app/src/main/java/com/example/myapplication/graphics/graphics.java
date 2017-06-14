package com.example.myapplication.graphics;

/**
 * Created by kononovk
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class graphics extends MainActivity {
    double degree = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView imgview = (ImageView) findViewById(R.id.weapon1);
    }
}