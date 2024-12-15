import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {



        Scanner usuario = new Scanner(System.in);
        usuario.nextLine();

        int numMax = 10;
        String[] ninjas = new String[numMax];

        int cadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = usuario.nextInt();
            usuario.nextLine();

            switch (opcao) {
                case 1:
                    if (cadastrados < numMax){
                        System.out.println("Digite o nome par ao ninja ");
                        String nomeNinja = usuario.nextLine();
                        ninjas[cadastrados] = nomeNinja;
                        cadastrados++;


                    }else{
                        System.out.println("A lista ja esta completa");
                    }
                    break;
            }








        }
        usuario.close();
    }
}
