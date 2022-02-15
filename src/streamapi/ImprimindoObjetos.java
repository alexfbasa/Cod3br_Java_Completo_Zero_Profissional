package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> aprovados = Arrays.asList("Alex", "Anselmo", "Gaby");

        System.out.println("Usando o For");
        for(int i = 0 ; i < aprovados.size(); i++){
            System.out.println(aprovados.get(i));
        }

        System.out.println("Usando o Foreach");

        for(String nomes: aprovados){
            System.out.println(nomes);

        }

        System.out.println("\nUsando o Iterator");
        //Chamando o Iterator
        //Ele chama a lista
        Iterator<String> it = aprovados.iterator();
        //Enquanto existir o proximo nome, var para o proximo
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\nUsando o Stream");

        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }
}
