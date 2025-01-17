package Intermediary.FinalMethods;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Metodo que todo ninja vai fazer obrigatoriamento
    final void tacarKunai(){ // quando colocamos final ele nao pode ser sobrescrito
        System.out.println("Sou um metodo da classe mae");
    }

}
