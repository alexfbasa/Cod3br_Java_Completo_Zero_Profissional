package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        // Criar um consumer para criar um "Alias" para o System.out.println

        Consumer<String> print = System.out::print;
        Consumer<String> printTest = System.out::println;

        // Forma de criar um Stream
        Stream<String> curso = Stream.of("Python ", "Java ", " Python3 ", "Go\n");
        curso.forEach(print);

        // Forma de criar dois
        String[] maisLangs = {"PHP ", "JavaScript ", "Perl ", "Ruby"};
        for (String m : maisLangs) {
            System.out.println(m);
        }
        System.out.println("\n###############\n");
        System.out.println("Outra forma");

        // Forma de criar direto passando o Array maisLang na Stream
        Stream.of(maisLangs).forEach(print);
        System.out.println("\n###############\n");
        // Forma de criar direto no Array passando o Array inteiro
        Arrays.stream(maisLangs).forEach(print);
        System.out.println("\n###############\n");

        Arrays.stream(maisLangs, 0, 2).forEach(print);

    }

}
