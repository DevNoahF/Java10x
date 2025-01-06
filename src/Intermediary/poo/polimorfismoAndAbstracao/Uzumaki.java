package Intermediary.poo.polimorfismoAndAbstracao;

public class Uzumaki extends Ninja{

    @Override //sobreescrever um metodo abstrato
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: "+nome+" E minha habilidade especial é ser um Uzumaki");
    }
}
