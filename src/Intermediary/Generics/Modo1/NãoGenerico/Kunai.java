package Intermediary.Generics.Modo1.NãoGenerico;

public class Kunai {
    private String nome;

    public Kunai(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() { // esse é um metodo do proprio java que converte objetos em uma representação String
        return "Kunai: " + nome;
    }
}
