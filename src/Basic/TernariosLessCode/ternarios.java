package Basic.TernariosLessCode;

public class ternarios {
    public static void main(String[] args) {

        // ternarios é como uma refatoração, simplificamos e diminuimos linhas nao alterando o resultado final do codigo
        // ESTRTURA: variavel = (condição) '?' valorseVerdadeiro: valorSeFalso
        // quando a condição for verdadeira iremos utilizar ' ? '
        // quando a condição for falsa, iremos utilizar ' : '

        short numMissoes = 1;
        String nivel = (numMissoes >= 10) ? "Voce é gay e tem mais de 10 missoes concluidas" : "voce é beta e tem menos de 10 missoes concluidas";
        System.out.println(nivel);

    }
}
