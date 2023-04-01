package orientacaoobjeto.playingDesafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }
    double getValorTotao(){
        double total = 0;
        for(Compra compra: compras){
            total += compra.getValorTotal();
        }
        return total;
    }
}
