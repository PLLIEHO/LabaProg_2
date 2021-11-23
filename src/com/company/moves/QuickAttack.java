package com.company.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class QuickAttack extends PhysicalMove {
    public QuickAttack(){
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe(){
        return "Техника Быстрой Атаки!";
    }
}
