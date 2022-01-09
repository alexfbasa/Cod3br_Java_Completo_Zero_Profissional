package classesmetodos.desafio;

public class SistemaJantar {
	
	public static void main(String[] args) {
		Pessoa cliente1 = new Pessoa("Roberto", 98.0);
		System.out.println(cliente1.dadosPessoais());
		
		Comida comida1 = new Comida("Arroz", 2.0);
		
		cliente1.comeComida(comida1);
		
		Comida comida2 = new Comida("Feijão", -2.0);
		cliente1.comeComida(comida2);
		
		
		System.out.println(cliente1.dadosPessoais());
		
		
	}

}
