package com.example.myapplication.graphics;

/**
 * Created by kononovk
 */
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class graphics extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.monstrik));
    }
}

