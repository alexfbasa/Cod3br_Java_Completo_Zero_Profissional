package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinarioTreino {

	public static void main(String[] args) {

		BinaryOperator<Double> calcMedia = (n1, n2) -> (n1 + n2) / 2;

		BiFunction<Double, Double, String> resultadoFinal = (n1, n2) -> {
			double calc = (n1 + n2) / 2;
			return calc >= 7 ? "Aprovador" : "Recuperacao";

		};
	}

}
