package excecao.personalizadaB.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;

    }

    public String getMessage() {
        return String.format("A String '%s' esta vazia ", nomeDoAtributo);
    }
}
