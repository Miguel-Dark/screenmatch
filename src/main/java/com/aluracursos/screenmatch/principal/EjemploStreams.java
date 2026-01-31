package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {

    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Brenda", "Luis", "María Fernanda", "Eric", "Génesys");
        nombres.stream()
                .sorted()
                .limit(4)
                .filter(n -> n.startsWith("G"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
