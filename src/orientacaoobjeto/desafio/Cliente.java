package orientacaoobjeto.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;
	ArrayList<Compra> compras = new ArrayList<>();

	Cliente(String nome) {
		this.nome = nome;
	}
	
	// Importou da classe compras
	double obterValorTotal() {
		double total = 0;
		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;

	}

}
