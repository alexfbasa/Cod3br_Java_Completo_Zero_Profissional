package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = produto -> produto.preco * ( 1 - produto.desconto);
		UnaryOperator<Double> impostoMunic = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> precoFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = null;
		Function<Double, String> formatar = null;
		
		
	}

}
  