package switchCases;

import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        // switch Cases = Servem para gerar casos especificos
// objetivo: usuario escolha um dos switch cases, e com isso vem uma condição

        Scanner scanner= new Scanner(System.in); // aberura da caixa

        System.out.println("Escolha um personagem: ");

        System.out.println("1 -> Naruto");
        System.out.println("2 -> Kakashi");
        System.out.println("3 -> Sua mae");


        int escolha =  scanner.nextInt();

        System.out.println("Sua opção: "+escolha);




        switch(escolha){
            case 1:
                System.out.println("Voce escoheu o Narutinho");
                break;
            case 2:
                System.out.println("Voce escoheu o Kakashi");
                break;
            case 3:
                System.out.println("Voce escoheu o Sua mae");
                break;

        }

        scanner.close(); //fechamento da caixa

    }
}
