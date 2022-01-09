/*
 * Classe produto treino ""copyright 2022""
 */

package classesmetodos;

/**
 * Clarsse para instanciar um novo produto
 * 
 * @author mrlee
 * @version 0.1
 */
public class Produto {
	// Aqui caracterista
	// Sao unicas de cada aplicacao
	String nome;
	double preco;
	double desconto;

	// Alterado o contrutor padrão, agora 3 atributos
	/**
	 * Instânci um objeto na memória
	 * 
	 * @param nome
	 * @param preco
	 * @param desconto
	 */
	Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	// Voltei o construtor padrão
	// Podemos criar com dois construtores agora
	Produto() {

	}

	/**
	 * 
	 * @return Metodos Getters e Setters
	 */
	// Traz segurança
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		return "O produto " + nome + " com o valor " + preco + " e desconto de " + desconto;
	}
	public double somarCompra() {
		double total = 0;
		total += this.preco;
		
		return total;
	}

}
