package Basic.scanner;
import java.util.Scanner;

public class firstTime {
    public static void main(String[] args) {
        //    Scanner = é um jeito de trazer o usuario para dentro da aplicação
        // Scanner é uma caixa que sempre que aberta, precisa ser fechada
        //Objetivvo: o usuario vai criar um ninja e vamos validar os dados

        Scanner caixaDeTexto = new Scanner(System.in) ; // System.in =  voce esta autorizando o usuaario a escrever

        // caixaDeTexto.nextLine() -> usado quando quer receber uma string

        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();



        System.out.println("Escreva a idade aqui:");
        int idadeNinja = caixaDeTexto.nextInt();


        System.out.println("O nome do ninja é : "+nomeDoNinja);
        System.out.println("A idade do ninja é: "+ idadeNinja + " anos");


        //Fechar sempre o Scanner
        caixaDeTexto.close();

    }
}
