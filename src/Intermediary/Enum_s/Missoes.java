package Intermediary.Enum_s;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;

    // metodo para mostrar info
    public void exibirDetalhes() {
        System.out.println("Missao: " + nome + " -> RANK: " + rank + " -> Descrição: " + rank.getDescricao() + " -> Dificuldade: " + rank.getDificuldade());
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
