package Intermediary.OverloadSobrecargaConstrutores;

public abstract class Ninja {
    //TODO: Incluir 2 novos atributos: numMissoesConcluida, Rank
    // TODO: RANK: Gennin, Chunnin, Jounnin, Hokage
// ENUMS SAO CRIADOS PARA QUE NAO OCORRA O RISCO DE SER ALTERADO, SAO UTILIZADOS PARA CARGOS OU COISAS QUE NAO IRAO SER MUDADAS DIARIAMENTE

    String nome;
    String aldeia;
    int idade;
    int numMissoesConcluidas;
    NivelNinja rank;  // Declaração de um ENUM


    public Ninja() {

    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: SOBRECARGA DO CONSTRUTOR CHAMANDO OS NOVOS ATRIBUTOS
// Sobrecarga de metodos voce nao precisa redeclarar os contrutores, apenas os novos atributos

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public abstract void habilidadeEspecial();

    public abstract void estrategiaDeBatalhaNinja();
}
