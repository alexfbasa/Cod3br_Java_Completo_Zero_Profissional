package arraysecollections;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas vamos calcular? ");
		int qtdeNotas = entrada.nextInt();
		double[] notas = new double[qtdeNotas];

		// Criar o for para enviar cada nota para um contador
		for (int count = 0; count < notas.length; count++) {
			// Pedir cada nota
			System.out.print("Informe a nota " + (count + 1) + ": ");
			// Chamar o Scanner para armazenar as notas
			notas[count] = entrada.nextDouble();

		}
		double total = 0;
		for (double nota : notas) {
			System.out.println(nota);
			total += nota;

		}
		double media = total / notas.length;

		System.out.println("A media do aluno é " + media);
		entrada.close();
	}

}
