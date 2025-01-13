package Intermediary.poo.SuperclassVsSubclass;

public class Uchiha extends Ninja{

    public Uchiha(){
        super(); // super todos os argumentos que estao no construtor da classe mae
    }

    // ao utilizar a função super(), iremos importar o construtor da classe mae para a subclass

    // iremos utilizar esse modo de escrita do construtor por estarmos importando basicamente o construtor da classe mae.

    public Uchiha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: "+nome+" E minha habilidade especial é ser um Uchiha");

    }

}

