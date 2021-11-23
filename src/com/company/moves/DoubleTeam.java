package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends PhysicalMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe(){
        return "Техника Повышения Уклонения!";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect();
        pokemon.setMod(Stat.EVASION, 1);
        effect.turns(1);
    }
}
