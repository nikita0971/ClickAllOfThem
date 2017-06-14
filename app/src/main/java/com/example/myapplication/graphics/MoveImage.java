package com.example.myapplication.graphics;

/**
 * Created by Николай on 14.06.2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.example.myapplication.R;



public class MoveImage extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                ImageView img = (ImageView)findViewById(R.id.monstrik1);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                layoutParams.setMargins(150, 150, 0, 0);
                img.setLayoutParams(layoutParams);
    }
}

