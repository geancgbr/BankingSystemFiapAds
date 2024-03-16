package br.com.fiap;

public class Teste {
    public static void main(String[] args) {
        // Criando um usuário
        Usuario usuario = new Usuario("Gean", "geangbr@gmail.com", "+55119XXXXYYYY");

        // Criando uma conta corrente
        ContaCorrente contaCorrente = new ContaCorrente(usuario, 1000.0, 500.0);
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Limite do Cheque Especial: " + contaCorrente.getSaldoContaCorrente());

        // Criando uma conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca(usuario, 500.0, 0.03);
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());
        System.out.println("Taxa de Rendimento: " + contaPoupanca.getTaxaRendimento());
    }
}
