package Intermediary.OverloadSobrecarfaMetodos;

import Intermediary.OverloadSobrecargaConstrutores.NivelNinja;

public class Main {
    public static void main(String[] args) {

        // Sempre que um novo construtor for adicionado, o que vai ser instanciado vai sempre instanciado primeiro
        Uzumaki naruto = new Uzumaki(NivelNinja.KAGE, "Naruto Uzumaki", "aldeia da folha", 17, 69);
        naruto.missoesCon();
        naruto.packDoPe();

        System.out.println("_______________________________________________________________________________________");

        // Sempre que um novo construtor for adicionado, o que vai ser instanciado vai sempre instanciado primeiro
        Uchiha sasuke = new Uchiha(NivelNinja.CHUUNIN, "Sasuke Uchiha", "Aldeia da folha", 19, 999);
        sasuke.missoesCon();
    }
}
