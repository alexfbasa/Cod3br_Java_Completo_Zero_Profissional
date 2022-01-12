package orientacaoobjeto;

import java.util.ArrayList;

public class Compra {
	
	String nome;
	ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}

	double getSoma() {
		double total = 0;
		for (Item i : itens) {
			total += i.preco * i.qtde;
		}

		return total;
	}

}
