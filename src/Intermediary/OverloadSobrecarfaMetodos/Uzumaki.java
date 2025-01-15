package Intermediary.OverloadSobrecarfaMetodos;

import Intermediary.OverloadSobrecargaConstrutores.NivelNinja;

public class Uzumaki extends Ninja {

    public Uzumaki(String nome, String aldeia, int idade, int missoesConcluidas) {
        super(nome, aldeia, idade, missoesConcluidas);
    }

    public Uzumaki(NivelNinja rank, String nome, String aldeia, int idade, int missoesConcluidas) {
        super(rank, nome, aldeia, idade, missoesConcluidas);
    }

    @Override
    public void missoesCon() {
        System.out.println("Meu nome é: " + nome + " e tenho: " + missoesConcluidas + " missoes concluidas.");
        System.out.println("Meu nivel ninja é: " + rank);
    }

    public void packDoPe() {
        System.out.println("vendo o peck do pé por 100 reais cada foto.");
    }

}
