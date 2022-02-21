package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("Honda ", "Bmw ", "Ford");

        marcas.stream().map(m -> m.toLowerCase()).forEach(print);
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        marcas.stream().map(l -> l.toUpperCase()).forEach(print);
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        marcas.stream().map(Utils.minuscula).forEach(Utils.print);
        System.out.println("\n@@@   Usando Composicao         @@@@");

        marcas.stream()
                .map(Utils.primeiraLetra)
                .map(Utils.espaco)
                .map(Utils.maiuscula)
                .forEach(print);

        List<Integer> numeros = Arrays.asList(3, 1, 7, 4, 6, 5, 8, 10, 9);
        numeros.stream().map(n -> n -2).forEach(System.out::println);

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        List<Integer> multiplicar = Arrays.asList(3, 1, 7, 4, 6, 5, 8, 10, 9);
        multiplicar.stream().map(n -> n *3).forEach(System.out::println);


        multiplicar.stream().map(Utils.multiQuatro).forEach(System.out::println);

    }


}

