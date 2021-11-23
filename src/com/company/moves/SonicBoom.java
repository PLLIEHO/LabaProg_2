package com.company.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SonicBoom extends SpecialMove {
    public SonicBoom(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe(){
        return "Молниеносная атака!";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v){
        pokemon.setMod(Stat.HP, -20);
    }
}
