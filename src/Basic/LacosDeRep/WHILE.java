package Basic.LacosDeRep;

public class WHILE {
    public static void main(String[] args) {
        /*
         * Laços de repetição permite repetir infinitamente ou até aquela condição ser valida
         * WHILE ->
         * ESTRTURA: while(condição){o que estiver aqui dentro irá acontecer}
         *
         * */


        int numClones = 0;
        int numMaxClones = 40;

        while (numClones <= numMaxClones){
            numClones++;
            System.out.println("O narutinho fez um clone das sombras -> "+numClones);
        }
    }
}
