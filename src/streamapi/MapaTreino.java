package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MapaTreino {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        List<String> palabras = Arrays.asList("comida", "dança", "Trabalho", "Usuários", "cinema");
        palabras.stream().map(m -> m.toLowerCase()).forEach(print);
        System.out.println("/n########/n");
        palabras.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("/nFazendo Composição/n");
        //Criando os módulos
        UnaryOperator<String> maiuscula = m -> m.toUpperCase();
        // O charAt vai retorna só um caraceter.. Eu eu tenho que concatenar com uma String a saída por isso o +"!!!!"
        UnaryOperator<String> primeiraLetra = l -> l.charAt(0) + "";
        //E criando mais uma, pelo o valor recebido e concatena com a saída

        UnaryOperator<String> reforco = o -> o + "!!!!";
        //Forma normal
        System.out.println(maiuscula.andThen(primeiraLetra).andThen(reforco).apply("Campo Grande"));

        //Forma com Stream
        palabras.stream().map(maiuscula).forEach(print);
        palabras.stream().map(maiuscula).map(primeiraLetra).map(reforco).forEach(print);

        palabras.stream().map(Utis.maisculas).forEach(print);





    }
}
