package lambdas;

import java.util.function.BinaryOperator;

public class CalculoSistema3 {

	public static void main(String[] args) {

		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(10, 30));

		calc = (a, b) -> {
			return a / b;
		};

		System.out.println(calc.executar(30, 5));

		// Tornando mais simples
		// Nao precisa do return
		calc = (w, z) -> w * z;
		
		BinaryOperator<Integer> calcular = (a , b) -> { return a * b ;};
		System.out.println(calcular.apply(5, 10));
		
		BinaryOperator<Integer> executar = (a , b) -> a / b ;

	}
}
