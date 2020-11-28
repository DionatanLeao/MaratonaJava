package br.com.devdojo.introducao.controlefluxo;

/***
 * 
 * @author dionatan
 *
 */

public class ControleFluxoIfElse {
	public static void main(String[] args) {
		int idade = 20;
		float salario = 2000;
		String categoria;

		if (idade >= 18 && salario == 3000) {
			System.out.println("Entrou");
		} else {
			System.out.println("Negado");
		}

		System.out.println("\n--------------------------------------\n");

		if (idade < 15) {
			categoria = "Infantil";
		} else if (idade >= 15 && idade < 18) {
			categoria = "Juvenil";
		} else {
			categoria = "Adulto";
		}

		System.out.println(categoria);
	}
}