package orientacaoobjeto.relacao1x1;

public class Carro_v1 {

    String brand;
    double fatorAceleracao = 0.4;

//    Motor_v1 motor = new Motor_v1(); Vai ter problema pq tem que passar um motor como parametro
    Motor_v1 motor;

    Carro_v1(){
        this.motor = new Motor_v1(this);    }
    void acelerar() {
        if (motor.fatorIgnicao < 2.6) { //0.4 0.8 1.2 1.6 2.0 2.4 2.8 3.2
            motor.fatorIgnicao += fatorAceleracao;
        }
    }

    void frear() {
        if (motor.fatorIgnicao > 0.5) {
            motor.fatorIgnicao -= fatorAceleracao;
        }
    }

    void ligarCarro() {
        motor.isLigado = true;
    }

    void desligarCarro() {
        motor.isLigado = false;
    }

    String checarIsLigado() {
        if (!motor.isLigado) {
            return "Carro esta desligado";
        } else {
            return "Carro esta ligado.";
        }
    }
}
