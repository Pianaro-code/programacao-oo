public class ContaSalario extends Conta {
    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Conta salário não aplica juros diários
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Tipo de Conta: Conta Salário");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
    }
}