package orientacaoobjeto.relacao1xMuitos;

public class CompraMain_v1 {
    public static void main(String[] args) {
        Compra_v1 c1 = new Compra_v1();
        c1.cliente = "Osvaldo";
        c1.itens.add(new Item_v1("Lapis", 1, 8) );
        c1.addItem(new Item_v1("Pilha AA", 2.5, 4) );
        c1.addItem("Caderno", 5, 4); // Metodo que chama o outro metodo addItem
        c1.addItem("Polha A4", 10, 3); // Metodo que chama o outro metodo addItem
        System.out.println(c1.getValorTotal());

    }
}
