package example;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.Scanner;


@Data
@SuperBuilder



public class Wizzard extends Character{
    private Pet pet;
    private Wand wand;
    private House house;
    private ArrayList knownspells;
    private ArrayList potions;
    private int level;
    private boolean isalive;

    Scanner scanner = new Scanner(System.in);



public Boolean useSpell (Spell spell,AbstractEnemy enemy){

    if (Success.success(spell.success)){
        enemy.setHealthPointNow(enemy.getHealthPointNow()-spell.getDamage());
        return true;
    }
    else{
        enemy.setHealthPointNow(enemy.getHealthPointNow()-0);
        return false;
    }



    }


}
