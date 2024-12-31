package Intermediary.PooHeranca;

public class Main {
    public static void main(String[] args) {

        // Classes é  o molde do java


        // criar ninja joaozinho - objeto

        HerancaHumanos joaozinho = new HerancaHumanos(); // inicialização do objeto array
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


        //"Naruto é o unico que pode ativar o modo gay, por eu estar iniciando um objeto chamado naruto como herança de ' HerancaUzumaki ' "
        HerancaUzumaki Naruto =  new HerancaUzumaki();
        Naruto.nome = "Naruto";
        Naruto.idade = 17;
        Naruto.aldeia = "aldeia da folha";
        Naruto.ModoGyAtivado();


        HerancaHyuga hinata = new HerancaHyuga();
        hinata.nome = "Hinata";
        hinata.idade = 16;
        hinata.aldeia = "aldeia da folha";
        hinata.ativarHyunga();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.idade = 9;
        boruto.aldeia = "aldeia da folha";
        boruto.AtivarJougan();
        boruto.AtivarOkarma();
        boruto.ModoGyAtivado();
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