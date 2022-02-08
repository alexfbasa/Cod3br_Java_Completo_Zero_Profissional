package lambdas;

import java.util.function.BinaryOperator;

public class CalculoSistema {

    public static void main(String[] args) {

        // Usando Function, sem precisar usar a nossa Interface

        BinaryOperator<Double> calc = (o, u) -> {
            return o + u;
        };
        System.out.println(calc.apply(20.0, 10.0));

        BinaryOperator<Integer> calc2 = (a, b) -> {
            return a * b;
        };
        System.out.println(calc2.apply(9, 5));

        BinaryOperator<Integer> calc3 = (a, b) -> a / b;

        System.out.println(calc3.apply(100, 10));


    }
}