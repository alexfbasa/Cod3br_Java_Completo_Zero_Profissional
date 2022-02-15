package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("Ipad",3235.89, 0.13);
        Function<Produto, Double> precoFinal = produto -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> precoImposto = preco -> preco >= 2500 ? preco * 1.085 : preco ;
        UnaryOperator<Double> precoFrete = null;
        Function<Double, String> formatar = null;
        UnaryOperator<String> arredondar = null;


        String preco = precoFinal.andThen(precoImposto).andThen(precoFrete).andThen(formatar).andThen(arredondar).apply(p);


    }
}

