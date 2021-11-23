package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    private boolean flag;

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        if (flag) return "Открылось второе дыхание! Вперед!";
        return "Атака!";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        Status condition = pokemon.getCondition();
        if (condition.equals(Status.POISON) || condition.equals(Status.BURN) || condition.equals(Status.PARALYZE)) {
            flag = true;
            pokemon.setMod(Stat.HP, -2 * (int) Math.round(v));
        }
    }
}
