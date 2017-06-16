package com.example.myapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.Monsters.Monsters;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static double DPS = 0;
    public static double DPC = 1;
    public static long Credits = 0;
    static float deg = -90;
    private Animation anim1, anim2, anim3;
    private ImageView IV1; // monsters array
    private ImageView WP1; // weapons array
    private TextView Dhp;
    TextView TextMoney, TextStatistics, TextHP, TextDHP; // Money Text and DPS&DPC Text
    int flag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IV1 = (ImageView)findViewById(R.id.monstrik1);
        WP1 = (ImageView)findViewById(R.id.weapon1);
        Dhp = (TextView)findViewById(R.id.TextDHp);

        /* Monster death animation */
        anim1 = AnimationUtils.loadAnimation(this, R.anim.mycombo1);
        anim2 = AnimationUtils.loadAnimation(this, R.anim.mycombo2);
        anim3 = AnimationUtils.loadAnimation(this, R.anim.text_combo1);

        final Button shopButton = (Button)findViewById(R.id.shopButton);
        shopButton.setOnClickListener(this);

        final Button hitButton = (Button)findViewById(R.id.hitButton);
        hitButton.setOnClickListener(this);

        TextMoney = (TextView)findViewById(R.id.TextMoney);
        TextStatistics = (TextView)findViewById(R.id.TextStatistics);
        TextHP = (TextView)findViewById(R.id.TextHp);
        TextDHP = (TextView)findViewById(R.id.TextDHp);


        TextMoney.setText("        Coins: " + MainActivity.Credits);
        TextStatistics.setText("DPC: " + (int)MainActivity.DPC  +
                "  DPS: " + (int)MainActivity.DPS);

        TextHP.setText("HP:" + Monsters.hp);
    }

    /*************
     * Rotate function
     * for weapon
     *************/
    public void rotate(float degree)
    {
        final RotateAnimation rotateAnim1 = new RotateAnimation(0, degree, 0f, WP1.getHeight());
        final RotateAnimation rotateAnim2 = new RotateAnimation(degree, 0, 0f, WP1.getHeight());

        if (flag == 1)
        {
            rotateAnim1.setFillAfter(true);
            WP1.startAnimation(rotateAnim1);
            rotateAnim1.setDuration(400);
        }
        else
        {
            rotateAnim2.setFillAfter(true);
            WP1.startAnimation(rotateAnim2);
            rotateAnim2.setDuration(400);
        }
    }

    public void onAnimationImage1(View v)
    {
        v.startAnimation(anim1);
    }

    public void onAnimationImage2(View v)
    {
        v.startAnimation(anim2);
    }
    public void onAnimationText1(final View v)
    {
        v.animate().cancel();
        v.setVisibility(View.VISIBLE);
        v.setAlpha(1);
        v.setTranslationY(0.0f);
        v.animate().alpha(0.0f).translationYBy(-150).setDuration(1000).setListener(new AnimatorListenerAdapter()
        {
            @Override
            public void onAnimationEnd(Animator animation) {
                v.setVisibility(View.GONE);
            }
        });
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.shopButton:
                Intent intent = new Intent(this, Shop.class);
                startActivity(intent);
                break;
            case R.id.hitButton: // check HitButton click
            {
                /* Weapon Rotation */
                rotate(deg);

                /* Animation of monster death */
                flag = -flag;
                if (Monsters.hp <= DPC)
                {
                    if (flag == 1)
                        onAnimationImage1(IV1);
                    else
                        onAnimationImage2(IV1);
                }

                /* Damage to monster after click */
                Monsters.HitDamage(DPC);

                /* Player Coins And Statistics after monster death*/
                TextMoney.setText("        Coins: " + MainActivity.Credits);
                TextStatistics.setText("DPC: " + (int)MainActivity.DPC  +
                                       "  DPS: " + (int)MainActivity.DPS);
                TextHP.setText("HP:" + Monsters.hp);

                TextDHP.setText("-" + DPC);
                onAnimationText1(Dhp);
                break;
            }
        }
    }
}
