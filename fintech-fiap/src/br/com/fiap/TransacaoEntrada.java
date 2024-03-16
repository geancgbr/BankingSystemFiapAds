package br.com.fiap;

class TransacaoEntrada extends Transacao { // Classe TransacaoEntrada, subclasse de Transacao
    public TransacaoEntrada(Conta conta, double valor) {
        super(conta, valor);
    }
}
