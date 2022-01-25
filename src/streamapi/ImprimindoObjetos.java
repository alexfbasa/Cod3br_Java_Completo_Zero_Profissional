package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Alex", "Anselmo", "Gaby");

        System.out.println("Usando o Foreach");
        for(String nomes: aprovados){
            System.out.println(nomes);
        }
        System.out.println("\nUsando o Iterator");
        //Chamando o Iterator
        Iterator<String> iterator = aprovados.iterator();
        //Enquanto existir o proximo nome, var para o proximo
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\nUsando o Stream");

        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }
}
