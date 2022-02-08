package streams;

public class Produto {

    static String nome;
    static double preco;
    static double quantidade;

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Produto.nome = nome;
    }

    public static double getPreco() {
        return preco;
    }

    public static void setPreco(double preco) {
        Produto.preco = preco;
    }

    public static double getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(double quantidade) {
        Produto.quantidade = quantidade;
    }
}
