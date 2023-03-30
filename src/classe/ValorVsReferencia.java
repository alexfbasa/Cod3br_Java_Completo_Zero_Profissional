package classe;


import classesmetodos.desafio.Data;

public class ValorVsReferencia {
    public static void main(String[] args) {
        int a = 2;
        int b = a; // Isso ira copiar o valor
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        Data d1 = new Data();
        Data d2 = d1;


    }

}
