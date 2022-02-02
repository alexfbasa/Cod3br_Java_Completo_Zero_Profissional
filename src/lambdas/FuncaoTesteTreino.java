package lambdas;

import java.util.Scanner;
import java.util.function.Function;

public class FuncaoTesteTreino {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número::");

        int chute = scanner.nextInt();

        Function<Integer, String> parOuImpar = numero -> chute % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(chute));

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
        System.out.println(parOuImpar.andThen(oResultadoE).apply(chute));

        scanner.close();
    }
}
