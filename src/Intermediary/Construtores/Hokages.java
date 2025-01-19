package Intermediary.Construtores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;


    public Hokages(){
        // Contrutor vazio
    }



    // criar um construtor com argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
