package Intermediary.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca sasuke = new ContaPoupanca("Sasuke Uchiha",22.22,TipoDeConta.POUPANCA);
        sasuke.consultarSaldo();
        sasuke.depositar(22.22);
        sasuke.consultarSaldo();
    }
}
