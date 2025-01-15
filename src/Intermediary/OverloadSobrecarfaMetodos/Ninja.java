package Intermediary.OverloadSobrecarfaMetodos;

import Intermediary.OverloadSobrecargaConstrutores.NivelNinja;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;
    int missoesConcluidas;
    NivelNinja rank;

    public Ninja(String nome, String aldeia, int idade, int missoesConcluidas) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.missoesConcluidas = missoesConcluidas;
    }

    public Ninja(NivelNinja rank, String nome, String aldeia, int idade, int missoesConcluidas) {
        this(nome, aldeia, idade, missoesConcluidas);
        this.rank = rank;
    }

    public abstract void missoesCon();
}
