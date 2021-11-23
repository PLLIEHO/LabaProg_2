package com.company.pokemons;

import com.company.moves.DoubleTeam;
import com.company.moves.SteelWing;
import com.company.moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Croagunk extends Pokemon {
    public Croagunk(String name, int level){
        super(name, level);
        setType(Type.POISON, Type.FIGHTING);
        setStats(48, 61, 40, 61,40, 50);
        setMove(new SteelWing(), new Swagger(), new DoubleTeam());
    }
}
