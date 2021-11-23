package com.company.pokemons;

import com.company.moves.Rest;
import com.company.moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pikipek extends Pokemon {
    public Pikipek(String name, int level){
        super(name, level);
        setType(Type.NORMAL, Type.FLYING);
        setStats(35, 75, 30,30,30,65);
        setMove(new Rest(), new Swagger());
    }

}
