package org.example.temp;

public abstract class Animal {

    private String genero;
    private int expectativaDeVida;
    public Animal(String genero, int expectativaDeVida) {
        this.genero = genero;
        this.expectativaDeVida = expectativaDeVida;
    }

    abstract void som();

    void descricao() {
        System.out.println("Animal do gênero: " + genero + " e tem expectativa de " + expectativaDeVida + " anos.");
    }




}
