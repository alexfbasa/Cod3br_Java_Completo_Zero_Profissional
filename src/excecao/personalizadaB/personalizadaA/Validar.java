package excecao.personalizadaB.personalizadaA;

import excecao.Aluno;

public class Validar {

    private Validar() {
    }

    public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaDoIntervaloException {
//        if (aluno == null) {
//            throw new IllegalAccessException("O nome do aluno esta nulo! ");
//        }
        // trim para tirar espacos em branco isEmpty = esta vazio
        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            // Chamar minha excessao
            throw new StringVaziaException("nome");
        }
        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaDoIntervaloException("nota");
        }
    }
}
