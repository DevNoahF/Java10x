package Intermediary.poo.Abstracao;

public class Main {
    public static void main(String[] args) {
        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 45;
        Hashirama.sabedoriaHokage();

        System.out.println("meu nome é: " + Hashirama.nome);
        System.out.println("Tenho "+ Hashirama.idade+ " ano");


        // 1-> classes abstratas nao podem ser instanciadas
        // 2-> Metodos abstratos nao podem ter corpo

    }
}
