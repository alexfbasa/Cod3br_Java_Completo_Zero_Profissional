package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetosDois {

    public static void main(String[] args) {

        List<String> palavrasTeste = Arrays.asList("Sa", "Escola", "Filme", "Brasil", "Porcelana");

        System.out.println("###########################");
        System.out.println("Usando o For Normal");
        for (int p = 0; p < palavrasTeste.size(); p++) {
            System.out.println(palavrasTeste.get(p));
        }
        System.out.println("###########################");
        System.out.println("Usando o Foreach");
        for (String p : palavrasTeste) {
            System.out.println(p);
        }
        System.out.println("###########################");
        System.out.println("Usando o Iterator");
        Iterator<String> st = palavrasTeste.iterator();
        while (st.hasNext()) {
            System.out.println(st.next());
        }
        System.out.println("###########################");
        System.out.println("Usando o Stream");
        Stream<String> stream = palavrasTeste.stream();
        palavrasTeste.stream().forEach(System.out::println);

    }
}
