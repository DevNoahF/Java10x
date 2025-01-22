package Intermediary.Generics.Modo1.Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de pedra");
        EquipamentosNinja faca = new EquipamentosNinja("faca ninja");
        EquipamentosNinja porco = new EquipamentosNinja("porco ninja ajudante");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addEquipamentos((kunai));
        bolsaGenerica.addEquipamentos((faca));
        bolsaGenerica.addEquipamentos((porco));
        System.out.println(bolsaGenerica);


    }
}
