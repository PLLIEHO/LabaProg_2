package com.company.moves;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class SteelWing extends PhysicalMove {
    public SteelWing(){
        super(Type.STEEL, 70, 90);
    }

    @Override
    protected String describe(){
       return "Техника Стального Крыла!";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        boolean ver = new Random().nextInt(10) == 0;
        if (ver) {
            pokemon.setMod(Stat.DEFENSE, +1);

        }
    }

}
