package br.com.fiap;

class ContaPoupanca extends Conta { // Classe ContaPoupanca, subclasse de Conta
    private double taxaRendimento;

    public ContaPoupanca(Usuario usuario, double saldo, double taxaRendimento) {
        super(usuario, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    // Getter e Setter específico de ContaPoupanca
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}