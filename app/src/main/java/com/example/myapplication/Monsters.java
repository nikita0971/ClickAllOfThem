package com.example.myapplication;
import android.widget.ImageView;

/**
 * Created by Kononov Nickolay
 */

public class Monsters
{
    protected int hp;
    protected int gold;
    ImageView Image;

    int GetHp()
    {
        return hp;
    }
    int GetGold()
    {
        return gold;
    }
    ImageView GetImg()
    {
        return Image;
    }
}


