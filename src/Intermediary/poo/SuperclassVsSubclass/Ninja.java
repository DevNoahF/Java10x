package Intermediary.poo.SuperclassVsSubclass;

public abstract class Ninja  {
    String nome;
    int idade;

    public Ninja(){
    }

    // iremos apenas escrever this.nome = nome;
    // quando o construtor estiver na classe principal
    public Ninja(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void habilidadeEspecial();
}

// ´THIS´ É A REGRA PARA SUPER CLASSE
// E ´SUPER´ PARA SUB CLASSE