package classesmetodos.desafio;

public class Pessoa {

	final String nome;
	double peso;

	Pessoa(String nome, double peso) {
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

	void comeComida(Comida c) {
		this.peso += c.peso;
	}
	String dadosPessoais() {
		return "O " + nome + " tem " + peso +"Kg";
	}

}
