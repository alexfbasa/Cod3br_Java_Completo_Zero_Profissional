package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMaps {

    public static void main(String[] args) {
        List<Integer> numero = Arrays.asList(1,2,3,4,5,6,7,8,9);

        numero.stream().map(Integer::toBinaryString).forEach(System.out::println);

        System.out.println("##########");

        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaString = s -> Integer.parseInt(s , 2);

        numero.stream().map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaString)
                .forEach(System.out::println);
    }
}
