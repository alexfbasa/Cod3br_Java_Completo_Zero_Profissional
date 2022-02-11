package orientacaoobjeto.lambdas;

@FunctionalInterface
public interface Calculo {
	// Uma funcao de Interface soh pode ter apenas um metodo abstrato
	double executar(double a, double b); // Esse eh um metodo abstrato
	// double imprimir(double numero); Ao criar isso, tudo para de funcionar
	// Contudo, uma interface pode ter metodo defaul e static
	default String legal() {
		return "opa";
	}
	static String muitoLegal() {
		return "muito legal";
	}
}
