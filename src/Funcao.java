import java.util.Scanner;
import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um numero");
		double n = entrada.nextDouble();
		Function<Double, String> parImpar = numero -> n % 2 == 0 ? "Par" : "Impar";
		System.out.println(parImpar.apply(n));
		entrada.close();
		
		Function<String, String> resultado = valor -> "O resultado eh : " + valor;
		System.out.println(parImpar.andThen(resultado).apply(n));
		

	}

}
