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

		// O metodo ligar turbo so esta disponivel em Ferrari
		// Entao voce nao pode criar o carro generico como:
		// Carro ferrari = new Ferrari();
		Ferrari ferrari = new Ferrari(400);
		System.out.println("Ferrari esta em " + ferrari.getVelocidade() + "Km/h");
		ferrari.acelerar();
		ferrari.ligarTurbo();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.ligarAr();
		ferrari.desligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();
		System.out.println(ferrari.getVelocidade());
		ferrari.acelerar();

		System.out.println(ferrari.getVelocidade());
		

	}

}
