package orientacaoobjeto.relacao1xMuitos;

public class Item_v1 {
    String nome;
    double preco;
    int quantidade;
    Compra_v1 compra; // Isso faz com o que o metodo na Compra_v1 adicionarCompra ja receba um item

    Item_v1(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
