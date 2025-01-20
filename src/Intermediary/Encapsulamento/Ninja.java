package Intermediary.Encapsulamento;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numMissoesConcluidas;
    private double altura = 1.70;

    public Ninja(String nome, String aldeia, int idade, int numMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numMissoesConcluidas = numMissoesConcluidas;
        this.altura = altura;
    }

    // tirar dados ou mostrar para o usuario eu uso o GET + NOME DA VARIAVEL

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumMissoesConcluidas() {
        return numMissoesConcluidas;
    }

    // aqui nao precisamos retornar nada, pq ele apenas recebe valores
    public void setNumMissoesConcluidas(int numMissoesConcluidas) {
        this.numMissoesConcluidas = numMissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }




}
