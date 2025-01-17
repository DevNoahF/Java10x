package Intermediary.FinalMethods;

public class Uzumaki extends Ninja {

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void tacarKunai(){
        System.out.println("Sou um metodo da classe filha(subclass)");
    }


}
