package arraysecollections;

public class Arrays {

    public static void main(String[] args) {

        double[] notasDoAlunoA = new double[3];
        System.out.println(java.util.Arrays.toString(notasDoAlunoA));

        notasDoAlunoA[0] = 10;
        notasDoAlunoA[1] = 7.3;
        notasDoAlunoA[2] = 8;
        System.out.println(java.util.Arrays.toString(notasDoAlunoA));
        //Percorrer o Array
        double total = 0;
        for (int contador = 0; contador < notasDoAlunoA.length; contador++) {
            total += notasDoAlunoA[contador];

        }
        double mediaAlunoA = total / notasDoAlunoA.length;
        System.out.println(mediaAlunoA);
    }
}
