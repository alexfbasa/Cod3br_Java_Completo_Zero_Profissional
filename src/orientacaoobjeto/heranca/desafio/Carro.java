package orientacaoobjeto.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	int delta = 5;

	// Novo contrutor de carro e teremos que alterar no construtor da herana Ferrari
	// e Civic
	// No construtor de carro recebe a velocidade maxima agora
	// Velocidade recebe o que veio da construcao como parametro
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerar() {
		// Carro não pode andar mais que velocidade maxima
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else
			velocidadeAtual += delta;
	}

	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	int getVelocidade() {
		return velocidadeAtual;
	}

	public String toString() {
		return "Velocidade atual é " + velocidadeAtual;
	}
}
