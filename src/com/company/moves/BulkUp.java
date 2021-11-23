package com.company.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class BulkUp extends PhysicalMove {
    public BulkUp(){
        super(Type.FIGHTING, 0, 0);
    }

    @Override
    protected String describe(){
        return "Соберись! Сражение продолжается!";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.DEFENSE, 1);
    }
}
