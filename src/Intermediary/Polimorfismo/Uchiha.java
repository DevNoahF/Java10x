package Intermediary.Polimorfismo;

public class Uchiha extends Ninja{

    @Override // sobrescreve um metodo
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: "+ nome + " e esse é meu ataque Uchiha, um ataque de fogo!");
    }
}
