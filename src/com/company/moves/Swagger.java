package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe(){
        return "Техника Оглушения!";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.confuse();
        pokemon.setMod(Stat.ATTACK, 2);
    }
}
