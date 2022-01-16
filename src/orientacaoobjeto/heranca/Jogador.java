package orientacaoobjeto.heranca;

public class Jogador {
	public int vida = 100;
	public int x;
	public int y;

	
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// Aqui eu estou criando um instancia oponente - do Jogador
	// Como aqui recebe um jogador generico
	// Voce habilita receber as coisas por herança
	public boolean atacar(Jogador oponente) {
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

	public boolean andar(Direcao direcao) {

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
