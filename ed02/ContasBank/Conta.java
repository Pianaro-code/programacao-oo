public abstract class Conta {
    protected String cliente;
    protected double saldo;

    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println(cliente + " depositou R$" + valor);
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println(cliente + " sacou R$" + valor);
        } else {
            System.out.println(cliente + " tentou sacar R$" + valor + ", mas não há saldo suficiente.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println(cliente + " transferiu R$" + valor + " para " + destino.cliente);
        } else {
            System.out.println(cliente + " tentou transferir R$" + valor + ", mas não há saldo suficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void imprimirExtrato();

    public abstract void aplicarJurosDiarios();
}