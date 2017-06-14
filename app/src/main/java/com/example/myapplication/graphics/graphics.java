package com.example.myapplication.graphics;

/**
 * Created by kononovk
 */
import android.os.Bundle;
import android.widget.ImageView;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class graphics extends MainActivity {
    double degree = 60;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView monstrik1 = (ImageView) findViewById(R.id.monstrik1);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                ImageView img = (ImageView)findViewById(R.id.monstrik1);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                layoutParams.setMargins(150, 150, 0, 0);
                img.setLayoutParams(layoutParams);
            }

        });
    }
}