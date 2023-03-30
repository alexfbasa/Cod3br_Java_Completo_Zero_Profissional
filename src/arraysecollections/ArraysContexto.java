package arraysecollections;

import java.util.Arrays;

public class ArraysContexto {

    public static void main(String[] args) {

        double[] notasDoAlunoA = new double[3];
        System.out.println(Arrays.toString(notasDoAlunoA));

        notasDoAlunoA[0] = 10;
        notasDoAlunoA[1] = 7.3;
        notasDoAlunoA[2] = 8;
        int debug = notasDoAlunoA.length;
        System.out.println(debug);
        debug++;
        System.out.println(debug);
        System.out.println(java.util.Arrays.toString(notasDoAlunoA));
        //Percorrer o Array
        double total = 0;
        for (int contador = 0; contador < notasDoAlunoA.length; contador++) {
            total += notasDoAlunoA[contador];

        }
        double mediaAlunoA = total / notasDoAlunoA.length;
        System.out.println(mediaAlunoA);

        String[] nomesAlunos = {"Alex", "Mari", "Jake", "Maria"};
        System.out.println(Arrays.toString(nomesAlunos));

        for ( String element : nomesAlunos){
            System.out.println(element);
        }
    }
}
