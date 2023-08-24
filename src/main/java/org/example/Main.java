package org.example;

import org.example.carro.Carro;
import org.example.pagamentos.CartaoDeCredito;
import org.example.pagamentos.Pix;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Carro palio = new Carro();
        palio.nPortas = 4;
        palio.combustivel = "FLEX";
        palio.modificaEhManual(true);
        palio.modificaTamanhoPortaMala(5.5F);
        palio.printf();

        Carro jetta = new Carro();
        jetta.nPortas = 4;
        jetta.combustivel = "GASOLINA";
        jetta.modificaEhManual(false);
        jetta.modificaTamanhoPortaMala(6.5F);
        jetta.printf();

        Carro fusca = new Carro(4, "ALCOOL", true, 42121.3F);
        fusca.printf();

        Carro marea = new Carro(2, 211.3F);
        marea.printf();

        CartaoDeCredito cartao1 = new CartaoDeCredito();
        cartao1.setNumeroCartao("43243213241412");
        cartao1.setCvc("321");
        cartao1.setDataExpiracao("23/04");

        cartao1.pagar();
        cartao1.ultimosDigitos();


        Pix pix1 = new Pix();
        pix1.setChavePix("87238279");
        pix1.setValor(8328.23F);
        pix1.pagar();
        pix1.ultimosDigitos()


    }
}