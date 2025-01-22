package Intermediary.OverloadSobrecarfaMetodos;

public class Uchiha extends Ninja {

    public Uchiha(String sasukeUchiha, String aldeiaDaFolha, int idade, int numeroDeMissoesConcluidas, Intermediary.OverloadSobrecargaConstrutores.NivelNinja genin) {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }


    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + getNome() + " e esse é meu ataque Uchiha, um ataque de fogo. Eu ja completei: " + getNumeroDeMissoesConcluidas() + " missoes." );
    }


    @Override
    public void estrategiaDeBatalhaNinja() {

    }
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + getNome() + " Essa é minha INTELIGENCIA de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("seu qi é: " + qi + " e voce é um genio");
        } else if (qi >= 130) {
            System.out.println("seu qi é: " + qi + " e voce é um ninja promissor");
        } else {
            System.out.println("seu qi é: " + qi + " e voce precisa treinar mais suas habilidades");
        }
    }
}

