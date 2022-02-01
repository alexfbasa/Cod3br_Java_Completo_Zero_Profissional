package lambdas;

@FunctionalInterface
public interface Calculo {

	/*
	 * Qualquer implementacao que recebe dois numeros e retorna algo pode ser
	 * Usada com essa interface, o que mudar sera o que a classe construir Uma
	 * interface nao precisa implementar o metodo todos Mas a classe que
	 * impletemta a interface eh a classe que tem que construir o metodo todo
	 * UNICO METODO ABSTRATOR
	 */

	double executar(double v1, double v2);
	// double teste();// Nao funciona pois so deve ter um unico metodo, com tudo
	// voce pode ter metodos defautls

	// Metodo DEFAULT
	default String issoPode() {
		return "Isso Pode";
	}

	static String issoTambemPode() {
		return "Isso tambem pode!!";
	}

}
