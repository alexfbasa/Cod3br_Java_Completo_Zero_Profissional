package classesmetodos.desafio;

public class SistemaProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto("Escova de dente", 14.00);
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		
		Produto p2 = new Produto("Notebook", 4000.00);
		Produto.desconto = 0.29;
		
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		

	}

}
