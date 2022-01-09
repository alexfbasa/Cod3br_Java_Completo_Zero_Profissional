package classesmetodos.desafio;

public class Comida {

	final String nome;
	double peso;

	Comida(String nome, double peso) {
		this.nome = nome;
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}

	public String getNome() {
		return nome;
	}

}
