package orientacaoobjeto;

public class SistemaCarro {
	
	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		System.out.println(car1.checkEstaLigado());
		System.out.println(car1.motor.giros());
		car1.ligarCar();
		System.out.println(car1.checkEstaLigado());
		System.out.println(car1.motor.giros());
		car1.acelearCar();
		car1.acelearCar();
		car1.acelearCar();
		car1.acelearCar();
		car1.acelearCar();
		car1.acelearCar();
		car1.acelearCar();
		car1.acelearCar();
		car1.acelearCar();
		car1.acelearCar();
		System.out.println(car1.motor.giros());
		
	}

}
