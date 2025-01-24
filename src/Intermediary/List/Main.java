package Intermediary.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*As Listas em Java são estruturas de dados que permitem armazenar e manipular coleções de objetos
         de forma dinâmica.
         Elas fazem parte do pacote java.util e são amplamente usadas para lidar com grupos de elementos,
         como uma lista de personagens de Naruto, por exemplo.*/

        /*Principais Conceitos sobre Listas:
                ArrayList: Uma implementação de List baseada em arrays redimensionáveis. É uma das implementações mais comuns e flexíveis para listas dinâmicas.
                LinkedList: Uma implementação de List baseada em uma estrutura de lista encadeada. Ela é mais eficiente em operações de inserção e remoção no início e no meio da lista.
                Iteração: É possível percorrer os elementos de uma lista utilizando laços como for, while, ou o for-each.*/

        /*DIFERENÇA DE UM ARRAY PARA UMA LIST:
         * -> ARRAYS SÃO ESTATICOS, NÃO ALTERAM DE TAMANHO*/
        // Array
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        //System.out.println("Printando Array = "+ninjasArray[3]);

        // metodo para fazer com que print automatico:
        for (int i=0;i<ninjasArray.length;i++){
            System.out.println(ninjasArray[i]);
        }

        // Listas nao são estaticas, elas podem aumentar e diminuir
        List<String> gayList = new ArrayList<>(); // lista sempre começa vazia
        gayList.add("Naruto Uzumaki");
        gayList.add("Jacintinho");
        gayList.add("Jamal");

        System.out.println(gayList); //ja na lista ele mesmo ja faz essa conta autimaticamente

        // Adicionar na lista
        gayList.add("Trump");
        System.out.println(gayList);

        // Remover da lista
        gayList.remove("Jacintinho");
        System.out.println(gayList);

        // Trocar elementos
        gayList.set(1,"Jacintinho Junior");
        System.out.println(gayList);

        //Ver o tamanho da Lista
        System.out.println("Tamanho da lista: " + gayList.size());

    }
}
