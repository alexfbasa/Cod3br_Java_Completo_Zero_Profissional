package classe;

public class AreaCirc {

    static double pi = 3.14;
    double raio;

    AreaCirc(double setRaio) {

        raio = setRaio;
    }

    double CalcCircunferencia() {
        return raio * raio * pi;
    }
}
