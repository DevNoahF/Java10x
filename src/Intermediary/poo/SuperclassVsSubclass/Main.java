package Intermediary.poo.SuperclassVsSubclass;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 19;
        sasuke.habilidadeEspecial();

        System.out.println("--------------------------");

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.habilidadeEspecial();

        System.out.println("--------------------------");

        // função e utilização do construtor
        // Resumo: diminuição de linha para algo mais pratico e de facila manutenção
        Uchiha itachi = new Uchiha("Itachi Uchiha",27);
        itachi.habilidadeEspecial();



    }
}
