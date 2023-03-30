package classesmetodos.playing;

public class Jantar {

    public static void main(String[] args) {
        // criar pessoa
        // instanciar duas comidas
        // fazer pessoa coma a comida

        Pessoa p1 = new Pessoa("Jekaterine", 65.0);
        p1.setNome("Mariana");
        System.out.println("O Peso atual da " +p1.getNome()+" eh "+ p1.getPeso());
        Comida c1 = new Comida("Lazanha", 1.0);
        p1.comer(c1);
        System.out.println("Ah " + p1.nome + " tem o peso de " + p1.peso+" Kgs");

    }
}
