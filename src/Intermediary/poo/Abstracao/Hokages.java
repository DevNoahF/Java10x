package Intermediary.poo.Abstracao;

public abstract class Hokages {
    int idade;
    String nome;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

    public Hokages() {

    }
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }

    // all args contructor =  Contrutor com todos os argumentos
    public Hokages(String nome,int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
