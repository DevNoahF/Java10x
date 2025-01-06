package Intermediary.poo.SuperclassVsSubclass;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    int idade;

    public Ninja(){

    }

    public Ninja(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void habilidadeEspecial();
}
