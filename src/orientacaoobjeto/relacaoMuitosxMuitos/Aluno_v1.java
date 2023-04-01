package orientacaoobjeto.relacaoMuitosxMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno_v1 {
    final String nome;
    final List<Curso_v1> cursos = new ArrayList<>();

    Aluno_v1(String nome) {
        this.nome = nome;
    }
    void addCurso(Curso_v1 curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
