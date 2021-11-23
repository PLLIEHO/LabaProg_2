package com.company.pokemons;

import com.company.moves.QuickAttack;
import ru.ifmo.se.pokemon.Type;

public class ToxicRoak extends Croagunk {
    public ToxicRoak(String name, int level){
        super(name, level);
        setType(Type.POISON, Type.FIGHTING);
        setStats(83,106,65,86,65,85);
        addMove(new QuickAttack());
    }
}
