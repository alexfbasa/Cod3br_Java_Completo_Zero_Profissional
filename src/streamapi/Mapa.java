package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Mapa {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        List<String> marcas = Arrays.asList("bmw", "audi", "honda");

        marcas.stream().map(letrasMaisculas -> letrasMaisculas.toUpperCase()).map(letrasMinusculas -> letrasMinusculas.toLowerCase()).forEach(print);

    }
}
