package orientacaoobjeto.exercicios;

public class Motor {

    boolean isOn = false;
    double speedFactor = 1;

    int engineTurning() {
        if (!isOn) {
            return 0;
        } else {
            return (int) Math.round(speedFactor * 3000);
        }
    }

}
