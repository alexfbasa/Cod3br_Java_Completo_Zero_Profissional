/*
 * Classe data treino ""copyright 2022""
 */
package classesmetodos.desafio;

/**
 * Classe para teste, instancia uma data com dois contrutores No contrutor
 * padrão será definido uma data que eu quero
 * 
 * @author mrlee
 *
 */
public class Data {

	int dia;
	int mes;
	int ano;

	/**
	 * Construtor com data padrão, quando usado definira essa data
	 */
	Data() {
		dia = 01;
		mes = 01;
		ano = 1970;
	}

	// No construtor com outra assinatura
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	// Validar dia
	public void setDia(int dia) {
		if (dia > 0 && dia <= 31) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	// Validar mes
	public void setMes(int mes) {
		if (mes > 0 && mes <= 12) {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	// Validar ano
	public void setAno(int ano) {
		if (ano > 1970 && ano <= 2022) {
			this.ano = ano;
		}
	}

	public String dataFormatada() {
		return "O dia é " + dia + " do mes " + mes + " e ano " + ano;
	}

}
