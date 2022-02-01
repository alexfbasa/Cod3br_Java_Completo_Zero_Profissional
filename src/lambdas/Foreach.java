package lambdas;

import java.util.Arrays;
import java.util.List;

import jdk.internal.dynalink.beans.StaticClass;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bet", "hugo");

		// ForEach normal
		System.out.println("ForEach Normal");
		for (String nomes : aprovados) {
			System.out.println(nomes);
		}

		// Eu vou passar a expressao como parametro para o ForEach funcao

		System.out.println("\n Usando Lambda #01...");
		aprovados.forEach((nome) -> {
			System.out.println(nome + "!!!");
		});

		System.out.println("\n Usando Method Reference #01...");
		aprovados.forEach(System.out::println);

		System.out.println("\n Usando Lambda #02...");
		aprovados.forEach(nome -> meuMetodoImprimir(nome));

		// Chmanado uma referencia de uma funcao que eu creie
		// Mesmo de uma funcao que ja foi criada 
		// Foreach <-
		System.out.println("\n Usando Method Reference #02...");
		aprovados.forEach(Foreach::meuMetodoImprimir);
	}

	static void meuMetodoImprimir(String nomes) {
		System.out.println("Voce esta usando a branch " + nomes);

	}

}
