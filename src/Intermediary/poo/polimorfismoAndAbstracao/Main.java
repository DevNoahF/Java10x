package Intermediary.poo.polimorfismoAndAbstracao;

public class Main {
    public static void main(String[] args) {
        // obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 19;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.habilidadeEspecial();

        System.out.println("---------------------------------");

        //obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.aldeia = "Aldeia da folha";
        naruto.habilidadeEspecial();
    }
}
