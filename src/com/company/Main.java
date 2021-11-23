package com.company;
import com.company.pokemons.Croagunk;
import com.company.pokemons.Pikipek;
import com.company.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Croagunk("Кроганк", 1);
        Pokemon p2 = new Pikipek("Пикипек", 1);
        Pokemon p3 = new Toucannon("Туканнон", 3);
        Pokemon p4 = new ToxicRoak("Токсикроук", 2);
        Pokemon p5 = new Trumbeak("Трамбик", 2);
        Pokemon p6 = new Furfrou("Фурфру", 4);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();
    }
}
