package com.company.pokemons;

import com.company.moves.BulkUp;
import com.company.moves.Facade;
import com.company.moves.Scald;
import com.company.moves.SonicBoom;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Furfrou extends Pokemon {
    public Furfrou(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(75, 80, 60, 65, 90, 102);
        setMove(new Scald(), new BulkUp(), new Facade(), new SonicBoom());
    }
}
