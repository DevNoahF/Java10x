package Intermediary.PolimorfismoAndHeranca;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da folha";
        naruto.habiidadeEspecial();

        System.out.println(naruto.nome);
        System.out.println(naruto.idade+" anos");
        System.out.println(naruto.aldeia);

        System.out.println("-----------------------------------------");
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 19;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.habiidadeEspecial();


        System.out.println(sasuke.nome);
        System.out.println(sasuke.idade+" anos");
        System.out.println(sasuke.aldeia);





    }
}
