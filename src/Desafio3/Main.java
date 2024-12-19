package Desafio3;

public class Main {
    public static void main(String[] args) {
        //inicialização do objeto
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.nivelDificuldade = "enorme";
        sasuke.idade = 19;
        sasuke.habilidadeEspecial = "voar";
        sasuke.missao = "pegar nas teta da vaca";
        sasuke.statusMissao = "Em andamento";
        sasuke.mostrarInformacoes();
        sasuke.mostrarHabilidadeEspecial();
    }
}
