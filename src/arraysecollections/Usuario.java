package arraysecollections;

public class Usuario {

	String nome;
	String email;

	// O Equals por padrão usa == e isso ao comparar objetos da falso
	// Pois compara a memória
	// Implementar o metódo equals que compara o que eu preciso
	public boolean equals(Object objeto) {
		//Armazenar o resultado numa variavel da Instancia
		Usuario outro = (Usuario) objeto;
		//Objeto é o item mais básico
		//Eu preciso compara isso com a classe CompararEqualHashcodeCliente ou Cliente que seria essa
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		
	}

}
