package classesmetodos;

public class SistemaProduto {

	public static void main(String[] args) {

		Produto p1 = new Produto("Caneta", 12.00, 0.25);
		System.out.println(p1.toString());
		// Posso criar passando item por item
		// Mas criei um construtor para facilita
		Produto p2 = new Produto();
		p2.nome = "Caderno";
		p2.preco = 10.00;
		p2.desconto = 0.28;
		System.out.println(p2.toString());

		double precoFina1 = p1.precoComDesconto();
		
		double precoFina2 = p2.preco * (1 - p2.desconto);
		System.out.println(precoFina1);
		System.out.println(precoFina2);

		double mediaCarrinho = (precoFina1 + precoFina1) / 2;
		System.out.println(mediaCarrinho);
		System.out.printf("Média do carrinho eh R$%.2f.", mediaCarrinho);
	}

}
