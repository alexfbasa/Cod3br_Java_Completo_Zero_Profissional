package orientacaoobjeto.exercicios;

public class Carro {

    Motor motor = new Motor();

    void turnOn() {
        motor.isOn = true;
    }

    void turnOff() {
        motor.isOn = false;
    }

    boolean checkIsON() {
        return motor.isOn;
    }

    void speeUP() {
        if (motor.isOn == true && motor.engineTurning() <= 260) {
            motor.speedFactor += 0.4;
        }
    }


    void speeDOWN() {
        if (motor.isOn == true && motor.engineTurning() >= 0.5) {
            motor.speedFactor -= 0.4;
        }
    }
}

