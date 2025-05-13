public class ContaCorrente extends Conta {
    private static final double TAXA_JUROS_DIARIOS = 0.001;

    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * TAXA_JUROS_DIARIOS;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Tipo de Conta: Conta Corrente");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
    }
}