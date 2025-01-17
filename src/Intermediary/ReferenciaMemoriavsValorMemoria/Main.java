package Intermediary.ReferenciaMemoriavsValorMemoria;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------- Obj Naruto-----------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "aldeia da folha",17);
        System.out.println(naruto); // ja é um metodo do proprio java
        //System.out.println(naruto); -> isso é referencia de memoria = espaço que esta alocado
        //System.out.println(naruto.nome); -> isso é valor em memoria =  e a apartir da refencia da memoria, sabemos
        // onde esta o valor que estao guardados dentro da memoria

        // to string vai pegar a referencia de memoria, e vai mostrar a referencia de memoria como algo visivel

        System.out.println("-----------Obj Sasuke------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha","aldeia da folha",20);
    }
}
