package Intermediary.OverloadSobrecarfaMetodos;

import Intermediary.OverloadSobrecargaConstrutores.NivelNinja;

public class Main {
    public static void main(String[] args) {

        // Sempre que um novo construtor for adicionado, o que vai ser instanciado vai sempre instanciado primeiro
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "aldeia da folha", 16,909, Intermediary.OverloadSobrecarfaMetodos.NivelNinja.KAGE);


        System.out.println("_______________________________________________________________________________________");

        // Sempre que um novo construtor for adicionado, o que vai ser instanciado vai sempre instanciado primeiro
        Uchiha sasuke = new Uchiha("Sasuke Uchiha","aldeia da folha", 19,999, NivelNinja.GENIN);




    }
}
