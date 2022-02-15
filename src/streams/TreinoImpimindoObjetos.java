package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class TreinoImpimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> pessoas = Arrays.asList("Paul");
		
		Stream<String> contar = pessoas.stream();
		contar.forEach(System.out::println);
	}

}
