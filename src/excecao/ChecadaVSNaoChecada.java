package excecao;

public class ChecadaVSNaoChecada {

    public static void main(String[] args) {
        gerarErro1();
    }

    // Nao basta voce apenas criar o erro, voce tem que lancar ele
    // Excecao nao checada NAO lancada
    static void gerarErro1() {
        new RuntimeException("Ocorreu um erro aqui e nao sera lancado " +
                "esta sem o trow ");
    }

    static void gerarErro2() throws Exception {
        throw new RuntimeException("Ocorreu um erro aqui e sera lancado");
    }


}
