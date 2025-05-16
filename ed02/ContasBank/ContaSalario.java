public class ContaSalario extends Conta {

    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    public void aplicarJurosDiarios() {
        // Conta salário não aplica juros
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato - Conta Salário ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }
}