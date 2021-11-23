package com.company.moves;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected String describe() {
        return "Техника Ошпаривания!";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        boolean ver = new Random().nextInt(90) <= 27;
        if (ver) {
            Effect effect = new Effect();
            effect.condition(Status.BURN);
            effect.turns(1);
            pokemon.addEffect(effect);
        }
    }
}
