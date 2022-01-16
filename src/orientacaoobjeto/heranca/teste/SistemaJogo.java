package orientacaoobjeto.heranca.teste;

import orientacaoobjeto.heranca.Heroi;
import orientacaoobjeto.heranca.Monstro;

public class SistemaJogo {
	
	public static void main(String[] args) {
		//Herdou de Jogador
		Heroi jogadorHeroi = new Heroi(10 , 11);

		//Herdou de Jogador
		Monstro jogadorMostro = new Monstro();
		jogadorMostro.x = 10;
		jogadorMostro.y = 11;
		System.out.println(jogadorHeroi.vida);
		System.out.println(jogadorMostro.vida);
		
		
		//Testar ataque
		jogadorHeroi.atacar(jogadorMostro);
		jogadorMostro.atacar(jogadorHeroi);
		
		System.out.println("*************");
		
		System.out.println(jogadorHeroi.vida);
		System.out.println(jogadorMostro.vida);
		
		
		
	}

}
