package classesmetodos;

public class AreaCirc {

	double raio;
	// Pi sendo atributo de instância
	static double PI = 3.14;

	AreaCirc(double raioInicial) {
		//Inicializaar na classe
		//pi = 3.14;
		raio = raioInicial;
	}
	double calcularRaio() {
		return PI * Math.pow(raio, 2);
	}

}
