package orientacaoobjeto.desafio;

public class SistemaCompra {

	public static void main(String[] args) {


		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 6.00, 2);
		compra1.adicionarItem(new Produto("Notebook", 10.00), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Estojo", 8.00, 2);
		compra2.adicionarItem("Borracha", 3.00, 3);
		
		Cliente cliente = new Cliente("Evaristo");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}

}
