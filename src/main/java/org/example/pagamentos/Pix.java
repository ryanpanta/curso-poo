package org.example.pagamentos;

public class Pix implements Pagamento{

    private String chavePix;
    private float valor;

    @Override
    public void pagar() {
        System.out.println("Valor total" + valor);
        System.out.println("Pago!!");
    }
    @Override
    public String ultimosDigitos() {
        System.out.println(chavePix.substring(0,4));
        return chavePix.substring(0,4);
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
