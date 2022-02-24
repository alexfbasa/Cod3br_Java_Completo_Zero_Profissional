package excecao;

public class Basico {

    public static void main(String[] args) {

        try {
            System.out.println(7 / 0);
        //Tratando de forma especifica
        } catch (ArithmeticException e) {
            //Imprimi a pila de excecucao
            e.printStackTrace();
        }

        try {
            System.out.println(7 / 0);
        //Tratando de forma generica
        } catch (Exception e) {
            System.out.println("O ocorreu um erro ao dividir por 0 ");
        }
        System.out.println("Fim :) ");
    }

}
