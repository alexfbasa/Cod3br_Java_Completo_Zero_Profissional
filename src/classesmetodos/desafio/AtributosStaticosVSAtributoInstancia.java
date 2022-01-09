package classesmetodos.desafio;

public class AtributosStaticosVSAtributoInstancia {
	// Atributo estático
	int a = 3;
	static int b = 4;

	public static void main(String[] args) {
		// Instanciando um objeto eu consigo acessar o atributo a

		AtributosStaticosVSAtributoInstancia p = new AtributosStaticosVSAtributoInstancia();

		System.out.println(p.a);

		// Se eu não quiser instanciar o objeto eu posso criar um objeto Static direto
		// o atributo B eu consigo acessar sem precisar instanciar um objeto
		
		System.out.println(b);
		

	}

}
