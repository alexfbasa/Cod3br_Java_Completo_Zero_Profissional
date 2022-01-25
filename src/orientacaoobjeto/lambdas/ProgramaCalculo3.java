package orientacaoobjeto.lambdas;

import java.util.function.BinaryOperator;

/**
 * 
 * @author alexandre.basilio Usarei uma interface funcional do proprio Java
 */
public class ProgramaCalculo3 {

	public static void main(String[] args) {
		
		//Interface direto do Java - dois operandos e produz resultado
		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calculo.apply(2.0 , 9.0));
		//Nesse caso eu nao precisei criar uma Interface funcional
		BinaryOperator<Integer> calculo2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo2.apply(2 , 9));

	}
}
