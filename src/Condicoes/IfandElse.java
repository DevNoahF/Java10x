package Condicoes;

public class IfandElse {
    public static void main(String[] args) {


        /*O que sao condicoes:
         *   - São condicoes/situacoes para que algo aconteça
         *
         * Objetivo: Passar o Naruto de nivel conforme o tanto de missoes feitas*/


        String nome = "Naruto";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroMissoes = 20;


        if (numeroMissoes == 10 && idade > 15) {
            System.out.println("chunnin");
        } else if (numeroMissoes >= 20) {
            System.out.println("Jounin");
        } else {
            System.out.println("gennim");
        }


    }
}

