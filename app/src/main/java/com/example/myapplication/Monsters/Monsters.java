package com.example.myapplication.Monsters;
import android.widget.ImageView;

/**
 * Created by Kononov Nickolay
 */

public class Monsters
{
    protected int hp;
    protected int MonsterGold;
    ImageView Image;

    int GetHp()
    {
        return hp;
    }
    int GetGold()
    {
        return MonsterGold;
    }
    ImageView GetImg()
    {
        return Image;
    }
}


