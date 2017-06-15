package com.example.myapplication.Monsters;
import android.widget.ImageView;

import com.example.myapplication.MainActivity;

/**
 * Created by Kononov Nickolay
 */

public abstract class Monsters
{
    public static int hpmax;
    public static int hp = 10;
    public static int MonsterGold = 10;
    ImageView Image;
    int NumOfWave = 1;
    int NumOfMonsters = 10;

    int GetHp()
    {
        return hp;
    }
    int GetHpMax()
    {
        return hpmax;
    }
    int GetGold()
    {
        return MonsterGold;
    }
    ImageView GetImg()
    {
        return Image;
    }
    public static void HitDamage( double damage )
    {
       hp -= damage;
       if (hp <= 0)
       {
           MainActivity.Credits += MonsterGold;
           hp = hpmax;
       }
    }
}