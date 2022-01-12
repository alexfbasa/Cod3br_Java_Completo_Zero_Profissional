package orientacaoobjeto;

public class SistemaCompra {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.nome = "Ricardo";
		//Posso fazer isso
		//E tambem fazer bidirecional com a compra e Item
		compra1.itens.add(new Item("Borracha", 3, 2.00));
		compra1.adicionarItem(new Item("Lapis", 4, 3.00));
		
		double valorCompra1 = compra1.getSoma();
		System.out.println(valorCompra1);
		
		
	}

}
