package classe;


import classesmetodos.desafio.Data;

public class ValorVsReferencia {
    public static void main(String[] args) {
        int a = 2;
        int b = a; // Atribuicao por valor
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        Data d1 = new Data();
        Data d2 = d1; //Atribuicao por referencia (Objeto)

        d1.setDia(31);
        d2.setMes(3);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());


    }

}
