package Intermediary.Construtores;

public class Main {
    public static void main(String[] args) {

        Hokages Hashirama = new Hokages();
        Hashirama.idade = 45;

        Hokages Tobirama = new Hokages( "Tobirama Senju");
            System.out.println(Tobirama.nome);

    }
}
