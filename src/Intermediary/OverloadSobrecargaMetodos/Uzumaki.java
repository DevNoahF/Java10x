package Intermediary.OverloadSobrecargaMetodos;

public class Uzumaki extends Ninja implements PackPe{

    public Uzumaki(String nome, String aldeia, int idade, int missoesConcluidas) {
        super(nome, aldeia, idade, missoesConcluidas);
    }

    @Override
    public void missoesCon(){
        System.out.println("Meu nome é: "+nome+" e tenho: "+missoesConcluidas+" missoes concluidas.");
    }

    public void packDoPe(){
        System.out.println("vendo o peck do pé por 100 reais cada foto.");
    }

}
