package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		//Implementacao para ver se eh caso norma eh isCaro
		
		Predicate<Produto> esCaro = prod -> false;
		Produto produto1 = new Produto("Notebook", 2.489, 0.15);
		
		
		System.out.println(esCaro.test(produto1));
		Predicate<Produto> isCaro = prod -> (prod.preco >= 3000);
		System.out.println(isCaro.test(produto1));

	}


}
