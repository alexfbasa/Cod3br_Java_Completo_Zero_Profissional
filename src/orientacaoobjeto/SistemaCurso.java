package orientacaoobjeto;

public class SistemaCurso {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Yrene Marian");
		
		Curso curso1 = new Curso("Java Completo");
		
		aluno1.adicionarCurso(curso1);
		for(Curso curso: aluno1.cursos) {
			System.out.println("Aluno1 " + curso.nome);
		}
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Curso1 " + aluno.nome);
		}
		System.out.println(aluno1.cursos.get(0).nome);
		
		System.out.println(aluno1.obterCurso("Java Completo"));
	}

}
