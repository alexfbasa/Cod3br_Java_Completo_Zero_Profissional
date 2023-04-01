package orientacaoobjeto.relacao1xMuitos;

import java.util.ArrayList;

public class Compra_v1 {
    String cliente;
    ArrayList<Item_v1> itens = new ArrayList<Item_v1>();

    void addItem(String nome, double preco, int quantidade){
        addItem(new Item_v1(nome,preco,quantidade));
    }
    /*
    Momento que esta adicionando o Item a minha lista, faz ao contrario
    adicionar a compra assoacida ao Item.
     */
    void addItem(Item_v1 item) {
        itens.add(item);
        item.compra = this;
    }

    double getValorTotal() {
        double total = 0;
        for (Item_v1 item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}

