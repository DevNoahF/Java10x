package Intermediary.OverloadSobrecargaMetodos;

import Intermediary.OverloadSobrecargaConstrutores.NivelNinja;

public class Uchiha extends Ninja{

    public Uchiha(String nome, String aldeia, int idade, int missoesConcluidas) {
        super(nome, aldeia, idade, missoesConcluidas);
    }

    public Uchiha(NivelNinja rank, String nome, String aldeia, int idade, int missoesConcluidas) {
        super(rank, nome, aldeia, idade, missoesConcluidas);
    }

    @Override
    public void missoesCon(){
        System.out.println("Meu nome é: "+nome+" e tenho: "+missoesConcluidas+" missoes concluidas.");
        System.out.println("Meu nivel ninja é: "+rank);
    }
}
