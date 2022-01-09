package classesmetodos.desafio;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;

	}

	double precoComDesconto() {
		double total = 0;
		total += preco * (1 - desconto);
		return total;
	}

	double precoComDescontoGerente(double descontoGerente) {
		double total = 0;
		total += preco * (1 - desconto + descontoGerente);
		return total;
	}

}
