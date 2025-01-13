package Intermediary.poo.HerancaMultiplaEInterface;

public abstract class Ninja {
    String nome;
    int idade;

    public Ninja(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void habilidadeEspecial();
}
