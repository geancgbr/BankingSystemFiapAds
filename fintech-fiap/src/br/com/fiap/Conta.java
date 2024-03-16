package br.com.fiap;

class Conta { // Classe Conta
    private Usuario usuario;
    private double saldo;

    public Conta(Usuario usuario, double saldo) {
        this.usuario = usuario;
        this.saldo = saldo;
    }

    // Getters e Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
