package arraysecollections;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos! ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Informe a quantidade de notas! ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double [qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				System.out.printf("Informe a nota %d do aluno %d :" , (nota +1), (aluno+1));
				notasDaTurma[aluno][nota] = entrada.nextDouble();
				total += notasDaTurma[aluno][nota];
				
			}
			
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println(" A media da turma é : " + media);
	}

}
