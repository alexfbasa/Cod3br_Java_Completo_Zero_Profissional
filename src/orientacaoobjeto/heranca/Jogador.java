package orientacaoobjeto.heranca;

public class Jogador {
	int vida = 100;
	int x;
	int y;

	// Aqui eu estou criando um instancia oponente - do Jogador
	// Como aqui recebe um jogador generico
	// Voce habilita receber as coisas por herança
	boolean atacar(Jogador oponente) {
		// Calcula a distancia do X entre os jogadores
		int deltaX = Math.abs(x - oponente.x);
		// Calcula a distancia do Y entre os jogadores
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			// Aqui eu coloca a instancia cria para subtrair a vida
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			;
			return true;
		} else
			return false;
	}

	boolean andar(Direcao direcao) {

		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			y++;
			break;
		}
		return true;

	}

}
