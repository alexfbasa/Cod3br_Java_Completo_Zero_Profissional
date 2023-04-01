package orientacaoobjeto.relacaoMuitosxMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso_v1 {

    final String nome;
    final List<Aluno_v1> alunos = new ArrayList<>();

    Curso_v1(String nome) {
        this.nome = nome;
    }

    void addAluno(Aluno_v1 aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }


}
