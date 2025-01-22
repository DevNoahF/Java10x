package Intermediary.OverloadSobrecarfaMetodos;

public enum NivelNinja {
    GENIN ("Isso é um GENIN"),
    CHUUNIN("Isso é um CHUUNIN"),
    JOUNNIN("Isso é um JOUNNIN"),
    KAGE("Isso é um KAGE");

    private String descricao;
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    NivelNinja(String descricao) {
        this.descricao = descricao;
    }
}
