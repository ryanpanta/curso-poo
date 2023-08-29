package org.example.temp;

public class Gato extends Animal {

    public Gato (String genero, int expectativaDeVida) {
        super(genero, expectativaDeVida);
    }

    @Override
    void som() {
        System.out.println("MIAU MIAU MIAU MIAUU");
    }
}
