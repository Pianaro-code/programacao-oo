public class ContaCorrente extends Conta {

    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    public void aplicarJurosDiarios() {
        saldo *= 1.001; // +0.1%
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato - Conta Corrente ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }
}