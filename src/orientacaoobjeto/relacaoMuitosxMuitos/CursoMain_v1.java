package orientacaoobjeto.relacaoMuitosxMuitos;

public class CursoMain_v1 {
    public static void main(String[] args) {
        Aluno_v1 aluno1 = new Aluno_v1("João");
        Aluno_v1 aluno2 = new Aluno_v1("Maria");
        Aluno_v1 aluno3 = new Aluno_v1("Pedro");

        Curso_v1 curso1 = new Curso_v1("Java Completo");
        Curso_v1 curso2 = new Curso_v1("Web 2023");
        Curso_v1 curso3 = new Curso_v1("JavaScript");

        aluno1.addCurso(curso1);
//        curso1.addAluno(aluno1);

        for (Aluno_v1 aluno : curso1.alunos){
            System.out.println("Estou matriculado no curso 1...");
            System.out.println("Meu nome é " + aluno.nome);
        }
    }
}
