package streams;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Utils {
    final static public Consumer<String> print = System.out::println;
    final static public UnaryOperator<String> minuscula = n -> n.toLowerCase();
    final static public UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    final static public UnaryOperator<String> espaco = n -> n + " ";
    final static public UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

    final static public UnaryOperator<String> inverterSetenca = i -> new StringBuilder().reverse().toString();



    final static public Predicate<Produto> caro = p -> p.preco >= 300.00;
    final static public Predicate<Produto> barato = p -> p.preco <= 300.00;
    final static public Function<Produto, String> nomeProduto = n -> "O produto " + n.nome;

    final static public UnaryOperator<Integer> multiQuatro = n -> n *4;

}
