package br.com.fiap;

class ContaCorrente extends Conta { // Classe ContaCorrente, subclasse de Conta
    private double saldoContaCorrente;

    public ContaCorrente(Usuario usuario, double saldo, double saldoContaCorrente) {
        super(usuario, saldo);
        this.saldoContaCorrente = saldoContaCorrente;
    }

    // Getter e Setter específico de ContaCorrente
    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }
}