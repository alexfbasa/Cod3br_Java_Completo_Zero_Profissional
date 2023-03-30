package classe;

public class AreaCircMain {

    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        double resultadoCalc = a1.CalcCircunferencia();
        System.out.println(resultadoCalc);
        AreaCirc.pi = 3.1415;

    }
}
