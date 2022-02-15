package streamapi;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ImprimindoCursosStream {

    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Stream<String> lista = Stream.of("Vida", "Tallinn","Java", "Stream.of");
        lista.forEach(print);

        String[] outrasCoisas = {"String[]", "Consumer", "Esforço"};
        Arrays.stream(outrasCoisas).forEach(print);
        System.out.println("\n\n");
        Arrays.stream(outrasCoisas, 1,3).forEach(print);
    }
}
