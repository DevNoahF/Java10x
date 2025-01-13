package Intermediary.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        // Resumo: Para a utilização de herança multipla nao tem muito o que ser feito a nao ser implementar
        // uma interface para ser reutilizada conforme as subclasses necessitarem.
        // Nao podemos extender mais de uma classe MAE, portanto vamos implementar uma interface para metodos
        // Deixando assim, cada subclasse pode ter seu proprio metodo,e tambem implementar o metodo da interface, se necessario

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.sharinganAtivado();

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.idade = 48;
        kakashi.aldeia = "Aldeia da folha";
        kakashi.boasVindas();
    }
}
