package orientacaoobjeto.heranca.desafio;

public class Carro {

<<<<<<< HEAD
	final int VELOCIDADE_MAXIMA;
	private int velocidadeAtual = 0;
	protected int delta = 5;

	// Novo contrutor de carro e teremos que alterar no construtor da herana Ferrari
	// e Civic
	// No construtor de carro recebe a velocidade maxima agora
	// Velocidade recebe o que veio da construcao como parametro
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		// Carro não pode andar mais que velocidade maxima
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else
			velocidadeAtual += delta;
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	public int getVelocidade() {
		return velocidadeAtual;
	}

	public String toString() {
		return "Velocidade atual é " + velocidadeAtual;
	}
=======
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual = 0;
    private int delta = 5;


    // Novo contrutor de carro e teremos que alterar no construtor da herana Ferrari
    // e Civic
    // No construtor de carro recebe a velocidade maxima agora
    // Velocidade recebe o que veio da construcao como parametro
    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    void acelerar() {
        // Carro não pode andar mais que velocidade maxima
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else
            velocidadeAtual += getDelta();
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
>>>>>>> a610c704c3e0250f7f6028f44b3d31356c44dff2
}
