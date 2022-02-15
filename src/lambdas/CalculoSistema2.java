package lambdas;

public class CalculoSistema2 {

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

	}
}
