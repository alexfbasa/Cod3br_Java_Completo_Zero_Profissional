package orientacaoobjeto.lambdas;

public class ProgramaCalculo2 {

    public static void main(String[] args) {
        //Atraves do lambda podemos criar funcoes anonimas
        //funcoes que nao tem nome, e o resultado podemos associar a uma variavel
        //Agora defino uma funcao que se adeque a interface que criei
        //Define dois parametros, gual foi definido no metodo da interface
        Calculo calculo = (x, y) -> {
            return x + y;
        };
        //Defini a logica dessa funcao, atraves dos parametros o Java associou
        System.out.println(calculo.executar(7, 10));

    }
}
