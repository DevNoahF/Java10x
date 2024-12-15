package scannersANDvalidations;

import java.util.Scanner;

public class scanners {
    public static void main(String[] args) {
        // scanner =  eh um jeito de trazer o usuario para dentro da aplicação, tendo como obrigação sempre fechar o scanner(caixa) quando aberto.

        Scanner caixaDeTexto = new Scanner(System.in); // sem que o scanner for aberto ele necessita ser fechado

        System.out.println("Escreva o nome do seu ninja: ");
        String nome = caixaDeTexto.nextLine();

        System.out.println("Escreva a idade do seu ninja: ");
        int idade = caixaDeTexto.nextInt();


        System.out.println("o nome do ninja é: "+ nome);
        System.out.println("O ninja "+nome + " tem " + idade+ " anos");

        //TRATAMENTO DE DADOS
        if(idade >= 18){
            System.out.println("ESSE NINJA JA É MAIOR DE IDADE, E JA PODE SER PRESO");

        }else{
            System.out.println("ESSE NINJA É MUITO NOVO, AINDA É UM BEBEZAO");
        }

        // FECHAMENTO DO SCANNER(CAIXA)
        caixaDeTexto.close();
    }
}
