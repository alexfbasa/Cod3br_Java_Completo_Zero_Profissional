package lambdas;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um numero::");
		int n = entrada.nextInt();
		Predicate<Integer> isPar = num -> n % 2 == 0 ;
		Predicate<Integer> isTreNumeros = num -> n >= 100 && n <= 999;
		
		System.out.println(isPar.and(isTreNumeros).test(n));
		
		
		
		entrada.close();
		
	}

}
