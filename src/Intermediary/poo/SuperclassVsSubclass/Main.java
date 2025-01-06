package Intermediary.poo.SuperclassVsSubclass;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 19;
        sasuke.habilidadeEspecial();

        System.out.println("--------------------------");

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        sasuke.habilidadeEspecial();
    }
}
