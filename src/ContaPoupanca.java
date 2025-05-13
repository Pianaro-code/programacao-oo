public class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS_DIARIOS = 0.0008;

    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * TAXA_JUROS_DIARIOS;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Tipo de Conta: Conta Poupança");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
    }
}