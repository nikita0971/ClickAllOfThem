package com.example.myapplication.graphics;

/**
 * Created by kononovk
 */
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import static com.example.myapplication.R.drawable.monstrik1;

public class graphics extends MainActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView monstrik1 = (ImageView)findViewById(R.id.monstrik1);
        setContentView(R.layout.activity_main);
    }
}