package br.com.fiap;

class TransacaoSaida extends Transacao { // Classe TransacaoSaida, subclasse de Transacao
    public TransacaoSaida(Conta conta, double valor) {
        super(conta, valor);
    }
}