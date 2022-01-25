package orientacaoobjeto.lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        for (String nomes : aprovados) {
            System.out.println(nomes + "%%%");
        }
        // Passando uma expressao Lambda
        // Vai informar o que vai fazer com cada elemento da lista
        System.out.println("\nLambda#01...");

        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!!");
        });

        // Um unico parametro
        aprovados.forEach(nome -> {
            System.out.println(nome + "!!!!");
        });

        // Uma unica sentenca de codigo

        aprovados.forEach(nome -> System.out.println(nome + "!!!!"));

        aprovados.forEach(nome -> meuImprimir(nome));

        // Method reference
        // :: {{Dois pontos pega cada uma das saida como parametro}}
        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println);


        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(Foreach::meuImprimir);


    }

    static void meuImprimir(String nome) {
        System.out.println("Oi meu nome eh " + nome);
    }

}
