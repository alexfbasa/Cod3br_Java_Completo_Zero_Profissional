package orientacaoobjeto.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}
	Ferrari(){
		this(315);
	}
//	void acelerar() {
//		velocidadeAtual += 15;
//	}

}
