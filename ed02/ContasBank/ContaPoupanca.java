public class ContaPoupanca extends Conta {

    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    public void aplicarJurosDiarios() {
        saldo *= 1.0008; // +0.08%
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato - Conta Poupança ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }
}