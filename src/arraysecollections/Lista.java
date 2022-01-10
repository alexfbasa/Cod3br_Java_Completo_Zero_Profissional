package arraysecollections;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		//Crio a lista e defino o tipo
		//No caso será o tipo que vem da classe usuário lista
		
		ArrayList<UsuarioLista> lista = new ArrayList<>();
		
		//Posso construir um objeto e adionar a lista
		
		UsuarioLista u1 = new UsuarioLista("Priscila");
		//Ou posso criar o usuário direto na lista
		
		lista.add(new UsuarioLista("Marcelo"));
		lista.add(new UsuarioLista("Edson"));
		lista.add(new UsuarioLista("Miriam"));
		lista.add(new UsuarioLista("Marcos"));
		
		//Percorrer a lista
		for (UsuarioLista usuarios : lista) {
			System.out.println(usuarios.nome);
			//Agora com o toString implementado eu consigo pegar a saida direto de usuaroi
			System.out.println(usuarios);
			
		}
		
		
		
		
	}

}
