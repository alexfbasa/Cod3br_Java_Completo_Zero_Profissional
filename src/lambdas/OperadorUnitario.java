package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnitario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> somar = n -> n + 2;
		UnaryOperator<Integer> multiplicar = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int result1 = somar.andThen(multiplicar).andThen(aoQuadrado).apply(30);
		System.out.println(result1);
		
		
		int result2 = aoQuadrado.compose(multiplicar).compose(somar).apply(30);
		System.out.println(result2);
		
	}

}
