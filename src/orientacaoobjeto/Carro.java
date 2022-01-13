package orientacaoobjeto;

public class Carro {
	
	double deltaVelocidade = 0.4;
	//Motor motor = new Motor();
	
	Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}
	
	void ligarCar() {
		motor.ligado = true;
	}
	void desligarCar() {
		motor.ligado = false;
	}
	boolean checkEstaLigado() {
		return motor.ligado;
	}
	void acelearCar() {
		if(motor.ligado == true && motor.fatorInjecao <= 2.6) {
			motor.fatorInjecao += deltaVelocidade;
		}
			
	}
	void frearCar() {
		if(motor.ligado == true && motor.fatorInjecao >= 0.5) {
			motor.fatorInjecao -= deltaVelocidade;
		}

		
	}

}
