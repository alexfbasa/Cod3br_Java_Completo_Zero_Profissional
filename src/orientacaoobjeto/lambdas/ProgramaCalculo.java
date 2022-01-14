package orientacaoobjeto.lambdas;

public class ProgramaCalculo {

    public static void main(String[] args) {
        Calculo calculo = new Somar();
        System.out.println(calculo.executar(4, 5));
        //Duas classes implemtam interface eu posso usar a mesma variavel
        calculo = new Multiplicar();
        System.out.println(calculo.executar(4, 5));

    }
}
