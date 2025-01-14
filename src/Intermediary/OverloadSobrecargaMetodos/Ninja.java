package Intermediary.OverloadSobrecargaMetodos;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;
    int missoesConcluidas;

    public Ninja(String nome, String aldeia, int idade, int missoesConcluidas) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.missoesConcluidas = missoesConcluidas;
    }

    public abstract void missoesCon();
}
