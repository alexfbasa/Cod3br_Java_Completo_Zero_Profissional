package orientacaoobjeto.exercicios;

public class CarroMain {

    static public void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.checkIsON());

        c1.turnOn();
        System.out.println(c1.checkIsON());
        System.out.println(c1.motor.engineTurning());

        c1.speeUP();
        c1.speeUP();
        c1.speeUP();
        c1.speeUP();
        System.out.println(c1.motor.engineTurning());
        c1.speeDOWN();
        c1.speeDOWN();
        c1.speeDOWN();
        c1.speeDOWN();
        c1.speeDOWN();
        c1.speeDOWN();
        System.out.println(c1.motor.engineTurning());
    }

}
