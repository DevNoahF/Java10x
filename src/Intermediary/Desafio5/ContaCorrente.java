package Intermediary.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, double saldo, TipoDeConta tipoConta, double deposito) {
        super(titular, saldo, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("depositando: R$" + valor);
    }
}

