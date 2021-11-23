package com.company.pokemons;

import com.company.moves.MudSlap;

public class Trumbeak extends Pikipek{
    public Trumbeak(String name, int level) {
        super(name, level);
        setStats(55,85,50,40,50,75);
        addMove(new MudSlap());
    }
}
