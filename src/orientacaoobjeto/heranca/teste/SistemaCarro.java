package orientacaoobjeto.heranca.teste;

import orientacaoobjeto.heranca.desafio.Carro;
import orientacaoobjeto.heranca.desafio.Civic;
import orientacaoobjeto.heranca.desafio.Ferrari;

public class SistemaCarro {

	public static void main(String[] args) {

		Carro civic = new Civic();
		System.out.println(civic.getVelocidade());
		civic.frear();
		System.out.println(civic.getVelocidade());
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic.getVelocidade());

		Ferrari ferrari = new Ferrari(400);
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		

	}

}
