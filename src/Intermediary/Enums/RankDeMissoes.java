package Intermediary.Enums;

public enum RankDeMissoes {
     // Uma classe ENUM é usada sempre que voce deseja padronizar seu codigo
    // para casos expecificios
    //quando voce tem certeza de que aquele ENUM nunca vai mudar

    // É UMA BOA PRATICA UTILIZAR APENAS LETRAS MAIUSCULAS EM ENUMS

    // EX: dias da semana
    // SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA;

    // EX: meios de pagamento
    //BOLETO, DINHEIRO, CARTAO_DE_CREDITO, PARCELADO, PIX;

    // Não podemos ter 2 enims em um mesmo file, temos que criar outro enum para adicionar outra lista
    //Um enum pode ter propriedades, um construtor privado, alem de metodos getters!
    // O construtor de um ENUM É SEMPRE PRIVADO

    D("Baixo",2),
    C("moderado",3),
    B("Confortavel",4),
    A("dificil",5),
    S("altissimo",12);

    private String Descricao;
    private int Dificuldade;

    RankDeMissoes(String Descricao, int Dificuldade) {
        this.Descricao = Descricao;
        this.Dificuldade = Dificuldade;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getDificuldade() {
        return Dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        Dificuldade = dificuldade;
    }
}
