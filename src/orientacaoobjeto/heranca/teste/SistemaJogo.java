package orientacaoobjeto.heranca;

public class SistemaJogo {
	
	public static void main(String[] args) {
		//Herdou de Jogador
		Heroi jogadorHeroi = new Heroi();
		jogadorHeroi.x = 10;
		jogadorHeroi.y = 10;

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
