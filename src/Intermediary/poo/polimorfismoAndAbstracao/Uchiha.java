package Intermediary.poo.polimorfismoAndAbstracao;

public class Uchiha extends Ninja{

    @Override // sobreescrever um metodo abstrato
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: "+nome+" e minha habilidade especial é ser um Uchiha");
    }

}
