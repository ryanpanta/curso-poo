package org.example.temp;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Cão", 15);
        Animal gato = new Gato("Felino", 12);
        cachorro.som();
        gato.som();
        cachorro.descricao();
        gato.descricao();
    }
}
