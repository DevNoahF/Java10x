package Intermediary.poo.HerancaMultiplaEInterface;

public class Uchiha extends Ninja{



    public Uchiha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: "+nome+" E eu vou ativar ativar o modo Uchiha");

    }
}
