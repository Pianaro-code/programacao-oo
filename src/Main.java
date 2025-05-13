public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente("João", 1000);
        Conta contaPoupanca = new ContaPoupanca("Maria", 2000);
        Conta contaSalario = new ContaSalario("Pedro", 1500);

        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaCorrente.transferir(contaPoupanca, 300);
        contaCorrente.aplicarJurosDiarios();
        contaCorrente.imprimirExtrato();

        contaPoupanca.aplicarJurosDiarios();
        contaPoupanca.imprimirExtrato();

        contaSalario.imprimirExtrato();
    }
}