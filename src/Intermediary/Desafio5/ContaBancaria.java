package Intermediary.Desafio5;

public abstract class ContaBancaria implements Conta {
    String titular;
    double saldo;
    TipoDeConta tipoConta;


    public ContaBancaria(String titular, double saldo, TipoDeConta tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;

    }


    public abstract void depositar(double valor);

    public abstract void consultarSaldo();
}
