package classesmetodos;

public class SistemaAreaCirc {
	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
		// Agora p1 virou atributo da classe
		// Alterado o valor de Pi altera em todos os lugares

		a1.PI = 10;
		AreaCirc a2 = new AreaCirc(5);
		// Pi tera o valor de 5
		a2.PI = 0;
		//O jeito correto agora para alterar o PI e alterar direto na classe
		AreaCirc.PI = 3.1415;
		
		System.out.println(a1.calcularRaio());
		System.out.println(a2.calcularRaio());
	}

}
