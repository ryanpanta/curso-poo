package org.example.temp;

public class Cachorro extends Animal{

    public Cachorro(String genero, int expectativaDeVida) {
        super(genero, expectativaDeVida);
    }

    @Override
    void som() {
        System.out.println("AUU AUU AUU AU");
    }
}
