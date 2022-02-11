package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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


    }


}

