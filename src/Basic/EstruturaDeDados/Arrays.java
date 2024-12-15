package Basic.EstruturaDeDados;

public class Arrays {
    public static void main(String[] args) {
        /*
        * Arrays serve para a alocação de um tipo de dados
        * */
//        Array é um tipo de dado nao primitivo -> chamado de referencia


        // Arrays são tipo referencia
        String[] ninja = new String[3];
        ninja[0] = "Narutinho"; // [ 0 ] -> o numero que fica dentro das [] se chama INDEX
        ninja[1] = "Jacinto";
        ninja[2] = "Joaozinho";
        System.out.println(ninja[0]);

        int[] idade = new int[2]; //-> new int[2] = novo espaço para memoria
        idade[0] = 17;
        idade[1] = 69;
        System.out.println(idade[0]);

//        String ninja1 = "Naturo";
//        String ninja2 = "Joaozinho";
//        String ninja3 = "Jacinto";
    }
}
