package com.company.pokemons;

import com.company.moves.AerialAce;

public class Toucannon extends Trumbeak {
    public Toucannon(String name, int level) {
        super(name, level);
        setStats(80, 120, 75, 75, 75, 60);
        addMove(new AerialAce());
    }
}
