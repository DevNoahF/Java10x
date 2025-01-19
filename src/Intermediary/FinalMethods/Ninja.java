package Intermediary.FinalMethods;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é: " + nome +" e minha estrategia de batalha é generica");
    }
}
