package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Alex", "Gabi", "Kate", "Fran");


        System.out.println("Usando o For");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }
        System.out.println("\n##########################");
        System.out.println("Usando o Foreach");
        for (String nomes : aprovados) {
            System.out.println(nomes);
        }
        System.out.println("\n##########################");
        System.out.println("Usando o Iterator");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\n##########################");
        System.out.println("Criando uma lista");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }

}
