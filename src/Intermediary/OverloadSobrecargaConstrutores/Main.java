package Intermediary.OverloadSobrecargaConstrutores;

public class Main {
    public static void main(String[] args) {



        Uzumaki naruto = new Uzumaki("Naruto Uzumaki","aldeia da folha",17,666,NivelNinja.KAGE);
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha","aldeia da folha",20,863,NivelNinja.KAGE);
        sasuke.habilidadeEspecial();

        Uchiha itachi = new Uchiha("Itachi Uchiha","aldeia da folha",29,83,NivelNinja.KAGE);
        itachi.habilidadeEspecial();

        Uchiha madara = new Uchiha("Madara Uchiha","aldeia da folha",40,900,NivelNinja.KAGE);
        madara.habilidadeEspecial();


    }
}
