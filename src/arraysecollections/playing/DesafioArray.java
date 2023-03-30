package arraysecollections.playing;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Quantas notas voce quer calcular? ");
        int qtdNotas = userInput.nextInt();
        double[] notasAluno = new double[qtdNotas];
        for (int contador = 0; contador < notasAluno.length; contador++) {
            System.out.println("Insira a nota " + (contador + 1));
            notasAluno[contador] = userInput.nextDouble();
        }
        System.out.println(Arrays.toString(notasAluno));

        double totalNotas = 0;
        for (double nota : notasAluno){
            totalNotas += nota;
        }
        System.out.println("A soma das notas:: " + totalNotas);
        double mediaNotas = totalNotas / notasAluno.length;
        System.out.println("A media das notas:: " + mediaNotas);

        userInput.close();


    }
}
