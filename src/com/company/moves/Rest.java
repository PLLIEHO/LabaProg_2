package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends PhysicalMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected String describe() {
        return "Техника Здорового Сна!";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.condition(Status.SLEEP);
        effect.turns(2);
        pokemon.restore();
        pokemon.addEffect(effect);
    }
}
