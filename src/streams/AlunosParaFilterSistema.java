package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AlunosParaFilterSistema {

    public static void main(String[] args) {

        AlunoParaFilter aluno1 = new AlunoParaFilter("Alex", 7.6, false);
        AlunoParaFilter aluno2 = new AlunoParaFilter("Regi", 8.5, true);
        AlunoParaFilter aluno3 = new AlunoParaFilter("Morn", 6.3, true);
        AlunoParaFilter aluno4 = new AlunoParaFilter("Leo", 4.4, false);
        AlunoParaFilter aluno5 = new AlunoParaFilter("Fiba", 4.7, false);
        AlunoParaFilter aluno6 = new AlunoParaFilter("Caca", 8.8, true);
        AlunoParaFilter aluno7 = new AlunoParaFilter("Reg", 4.1, true);
        AlunoParaFilter aluno8 = new AlunoParaFilter("Su", 7.1, true);
        AlunoParaFilter aluno9 = new AlunoParaFilter("Dougras", 1.9, false);

        List<AlunoParaFilter> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9);

        Predicate<AlunoParaFilter> notaAlta = a -> a.nota >= 6.0;
        Predicate<AlunoParaFilter> comportador = a -> a.bomComportamento == true;
        Predicate<AlunoParaFilter> merecePraia = a -> a.bomComportamento == true && a.nota >= 8.0;
        Predicate<AlunoParaFilter> notaBaixa = a -> a.nota <= 5.0;
        Consumer<String> print = System.out::println;
        Function<AlunoParaFilter, String> getNome = a -> "O aluno " + a.nome;
        Function<AlunoParaFilter, String> saudacaoPraia = a -> "Parabens " + a.nome + " Voce vai para a praia";

        System.out.println("###### Iniciando a BUILD ######");

        alunos.stream()
                .filter(merecePraia)
                .map(saudacaoPraia)
                .forEach(System.out::println);


    }
}
