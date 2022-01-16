package orientacaoobjeto.desafio;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p , int qtde) {
		this.itens.add(new Item (p  ,qtde));
	}
	// Ja cria um produto - adiciona um item e ja passa o item para a compra
	void adicionarItem(String nome , double preco , int qtde) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item (produto ,qtde));
		//this.itens.add(new Item (new Produto(nome, preco) ,qtde));
	}
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.qtde * item.produto.preco;
		}
		return total;
	}

}
