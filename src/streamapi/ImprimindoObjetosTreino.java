package streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetosTreino {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Alexande", "Jennifer", "Jhader");
        //Como pegar intens da Lista.
        //Metodo antigo pelo laço For
        for(int i = 0; i < aprovados.size(); i++){
            System.out.println(aprovados.get(i));
        }
        System.out.println("\n\nUsando o Foreach");
        for(String nomes: aprovados){
            System.out.println(nomes);
        }
        System.out.println("\n\nUsando o Iterator");
        Iterator<String> it = aprovados.iterator();
        //HasNext carrega
        //Next pula
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\n\nUsando Stream");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}
