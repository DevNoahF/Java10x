package Intermediary.FinalMethods;

public class Uzumaki extends Ninja {

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é: " + nome +" e minha estrategia de batalha é ser um Uzumaki");
    }
}
