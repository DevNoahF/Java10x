package Intermediary.Generics.Modo1.NãoGenerico;

public class Main {
    public static void main(String[] args) {
        // a utilização de generics é para fazer o codigo ser mais generico e reutilizavel

        Kunai kunai1 = new Kunai("Kunai tradicional");
        Kunai kunai2 = new Kunai("Kunai gay");
        Kunai kunai3 = new Kunai("Kunai laranja");

        BolsaKunai bolsaKunai = new BolsaKunai();
        bolsaKunai.addKunai(kunai1);
        bolsaKunai.addKunai(kunai2);
        bolsaKunai.addKunai(kunai3);
        System.out.println(bolsaKunai);

    }
}
