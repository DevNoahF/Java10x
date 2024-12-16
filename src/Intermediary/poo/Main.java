package Intermediary.poo;

public class Main {
    public static void main(String[] args) {

        // Classes é  o molde do java

        HerancaOthers Jacinto = new HerancaOthers();
        Jacinto.nome = "Jacintinho";
        Jacinto.idade = 19;
        Jacinto.aldeia = "aldeia da folha";
        Jacinto.AtivarPoder();

        // criar ninja joaozinho - objeto

        HerancaOthers joaozinho = new HerancaOthers(); // inicialização do objeto array
        joaozinho.nome = "joaozinho";
        joaozinho.idade = 19;
        joaozinho.aldeia = "casa de rinha de galo";
        joaozinho.AtivarPoder();


        // sasuke unico ninja que pode utilizar o ' sharingan '

        HerancaUchiha sasuke = new HerancaUchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 19;
        sasuke.aldeia = "aldeia da folha";
        sasuke.sharinganAtivado();


        HerancaHaruno naruto = new HerancaHaruno();
        naruto.nome = "Narutinho";
        naruto.idade = 17;
        naruto.aldeia = "aldeia da folha";
        naruto.ModoGay();

    }
}


/* Aula de introdução a metodos -> POO
*  int tempoFalta = naruto.anosParaSeTornarGay(200); // como em python, é necessario passar um parametro
        System.out.println("voce tem: "+naruto.idade + " entao falta no minimo: " +tempoFalta + " anos para voce se tornar gay");
*/
/*
* // aplicando metodos ao objeto
        naruto.sharinganAtivado(); //o parenteses ( ) mostra que isso é um metodo
        // em boas praticas é necessario utilizar uma variavel para guardar o return
        String callMethod = naruto.euSouNinja();    // para um return, como no python, é necessario printar
*/