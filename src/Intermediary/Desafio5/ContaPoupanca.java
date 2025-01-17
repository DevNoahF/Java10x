package Intermediary.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, double saldo, TipoDeConta tipoConta) {
        super(titular, saldo, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositando: R$"+ valor);
    }
}
