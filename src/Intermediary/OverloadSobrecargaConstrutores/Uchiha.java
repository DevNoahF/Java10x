package Intermediary.OverloadSobrecargaConstrutores;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: "+nome+" e minha habilidade especial é ser um Uchiha. Eu ja completei: "+numMissoesConcluidas+" missoes concluidas.");

    }

    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é: "+nome+" e minha estrategia de batalha ninja é dar o bumbum");
    }


}
