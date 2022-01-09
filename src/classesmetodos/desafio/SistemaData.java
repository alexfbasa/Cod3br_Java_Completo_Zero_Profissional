package classesmetodos.desafio;

public class SistemaData {

	public static void main(String[] args) {

		Data d1 = new Data();
		// Contrutor padrão vem com a data padrão
		System.out.println(d1.dataFormatada());
		// Construtor novo
		Data d2 = new Data(9, 1, 2022);
		System.out.println(d2.dataFormatada());
	}

}
