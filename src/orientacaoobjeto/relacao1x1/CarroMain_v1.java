package orientacaoobjeto.relacao1x1;

public class CarroMain_v1 {

    public static void main(String[] args) {
        Carro_v1 c1 = new Carro_v1();
        System.out.println(c1.checarIsLigado());
        c1.acelerar();
        System.out.println(c1.motor.giros());
        c1.ligarCarro();
        System.out.println(c1.checarIsLigado());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        // Encapsulamento
        //c1.motor.fatorIgnicao = -30  Proteger
        System.out.println(c1.motor.giros());
        /*
        Agora que carro tem um motor e motor tem um carro
        Motor_v1(Carro_v1 carro){
            this.carro = carro;
        }
        Conseguimos mais coisas
         */
        System.out.println(c1.motor.carro.motor.carro.motor.giros());
    }
}
