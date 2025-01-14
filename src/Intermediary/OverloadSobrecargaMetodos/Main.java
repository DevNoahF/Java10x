package Intermediary.OverloadSobrecargaMetodos;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki","aldeia da folha",17,69);
        naruto.missoesCon();
        naruto.packDoPe();

        System.out.println("_______________________________________________________________________________________");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da folha",19,999);
        sasuke.missoesCon();
    }
}
