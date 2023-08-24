package org.example.pagamentos;

public class CartaoDeCredito implements Pagamento {

    private String numeroCartao;
    private String cvc;
    private String dataExpiracao;

    public String getNumeroCartao() {
        return this.numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    @Override
    public void pagar() {
        System.out.println("Está pago!!");
    }

    @Override
    public String ultimosDigitos() {
        System.out.println(numeroCartao.substring(0,4));
        return numeroCartao.substring(0,4);
    }
}
