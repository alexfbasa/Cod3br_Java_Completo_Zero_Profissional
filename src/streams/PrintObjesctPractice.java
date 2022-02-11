package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class PrintObjesctPractice {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Kat", "Jekatarine", "Leonardo", "Anselmo");

        System.out.println("Imprimindo For antigo");
        for (int n = 0; n < nomes.size(); n++){
            System.out.println(nomes.get(n));
        }
        System.out.println("Imprimindo Foreach normal");
        for(String nome: nomes){
            System.out.println(nome);
        }
        Stream<String> nome = nomes.stream();
        Consumer<String> print = System.out::println;;
        nomes.stream().forEach(print);

    }
}
