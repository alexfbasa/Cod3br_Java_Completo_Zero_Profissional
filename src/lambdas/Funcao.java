package lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(55));

        Function<String, String> oResultadoE = tantoFaz -> "O resultado é: " + tantoFaz;

        Function<String, String> empolgado = mimimi -> mimimi + "!@@@!!";

        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(23);
        System.out.println(resultadoFinal);

    }
}
