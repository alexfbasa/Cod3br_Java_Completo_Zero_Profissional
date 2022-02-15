package streamapi;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Stream<String> cursos = Stream.of("Java ", "PHP ", "Bash " , "Go\n");
        cursos.forEach(print);

        //Criando Stream a parti de String
        String[] cursos2022 = {"Kizomba " , "Bachata ", "Salsa\n"};
        Stream.of(cursos2022).forEach(print);

        //Terceira forma de criar
        Arrays.stream(cursos2022).forEach(print);
        Arrays.stream(cursos2022, 1 , 2).forEach(print);


    }
}
