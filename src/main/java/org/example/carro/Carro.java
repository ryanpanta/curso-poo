package org.example.carro;

public class Carro {

    public Carro(){

    }

    public int nPortas;
    public String combustivel;
    private boolean ehManual;
    protected float tamanhoPortaMala;

    public void modificaEhManual (boolean ehManual) {
        this.ehManual = ehManual;
    }

    public boolean leEhManual () {
        return this.ehManual;
    }

    public void modificaTamanhoPortaMala (float tamanho) {
        tamanhoPortaMala = tamanho;
    }

    public float leTamanhoPortaMala () {
        return tamanhoPortaMala;
    }

    public void printf() {
        System.out.println("O carro possui " + nPortas + " portas" + " com o tipo de combustivel: " + combustivel + ", ele é manual ou" +
                " não? " + leEhManual() + " Com " + leTamanhoPortaMala() + " portas");
    }

    public Carro(int nPortas, String combustivel, boolean ehManual, float tamanhoPortaMala) {
        this.nPortas = nPortas;
        this.combustivel = combustivel;
        this.ehManual = ehManual;
        this.tamanhoPortaMala = tamanhoPortaMala;
    }

    public Carro(int nPortas, float tamanhoPortaMala) {
        this.nPortas = nPortas;
        this.tamanhoPortaMala = tamanhoPortaMala;
    }
}
