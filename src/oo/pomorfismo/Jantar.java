package oo.pomorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado1 = new Pessoa("Alexandre", 98.00);
        System.out.println(convidado1);

        Comida ingrediente1 = new Arroz(0.200);

        convidado1.comer(ingrediente1);

        System.out.println(convidado1);


    }
}
