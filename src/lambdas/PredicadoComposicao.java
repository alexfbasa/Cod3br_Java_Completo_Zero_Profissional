package lambdas;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que número você deseja sabe se é par? ");
        double n = scanner.nextDouble();
        Predicate<Integer> isPar = num -> n % 2 == 0;
        if(n % 2 == 0){
            System.out.println("O resultado é par");
        }else
            System.out.println("O resultado é impar:: ");

        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
        System.out.println(isPar.and(isTresDigitos).test((int) n));

        scanner.close();
    }

}
