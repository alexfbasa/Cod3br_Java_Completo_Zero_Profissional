package orientacaoobjeto.relacao1x1;

public class Motor_v1 {

    Carro_v1 carro;
    boolean isLigado = false;
    double fatorIgnicao = 1;

    Motor_v1(Carro_v1 carro){
        this.carro = carro;
    }
    int giros(){
        if (!isLigado){
            return 0;
        } else {
            return (int) Math.round(fatorIgnicao * 3000);
        }

    }

}
