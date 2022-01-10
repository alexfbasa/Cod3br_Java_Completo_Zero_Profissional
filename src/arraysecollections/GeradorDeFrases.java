package arraysecollections;

public class GeradorDeFrases {

	public static void main(String[] args) {

		String[] listaFrases = { "descansar", "em formação", "Visão", "quarto", "olho", "agente", "Está bem",
				"crescimento", "nascermos", "jovem", "por", "social", "perguntar", "interesse", "direção",
				"de Meio Ambiente", "lembrar", "aguentar", "inteira", "bebê", "realidade", "escolher", "descobrir",
				"questão", "nome", "qualidade", "dela", "computador", "E se", "Formato", "estude", "aparecer",
				"Congresso", "perguntar", "alguém", "resposta", "televisão", "hospital", "ainda", "boca", "mordeu",
				"Jardim", "exposição", "Senhor", "música", "verão", "hotel", "economia", "pessoal", "Operação",
				"permanecer", "então", "escolher", "política", "encontrar", "Ensinar", "montante", "experimentar",
				"adicionar", "por", "De repente", "há", "todo", "questão", "nos", "Conheçer", "opção", "tipo", "Paz",
				"telefone", "diretor", "projeto", "particularmente", "simplesmente", "filha", "menção", "vidro",
				"música", "poderia", "servir", "diferença", "perguntar", "ar", "procurar", "morte", "cortar", "cantar",
				"placa", "semana", "análise", "quando", "dirigir", "treinador", "Mais", "frente", "significativo" };

		int contarPalavras = listaFrases.length;
		int gerarRandomUm = (int) (Math.random() * contarPalavras);
		int gerarRandomDois = (int) (Math.random() * contarPalavras);
		int gerarRandomTres = (int) (Math.random() * contarPalavras);
		int gerarRandomQuatro = (int) (Math.random() * contarPalavras);
		int gerarRandomCinco = (int) (Math.random() * contarPalavras);

		String frase = "Imagina " + listaFrases[gerarRandomUm] + " do " + listaFrases[gerarRandomDois] + " pra piorar "
				+ listaFrases[gerarRandomTres] + " entre o periodo " + " das " + listaFrases[gerarRandomQuatro]
				+ " apertando " + listaFrases[gerarRandomCinco] + " de ladinho.";

		System.out.println(frase);

	}
}
