package br.com.fiap;

class Transacao { // Classe Transacao
    private Conta conta;
    private double valor;

    public Transacao(Conta conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    // Getters e Setters
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}