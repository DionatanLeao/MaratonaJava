package br.com.devdojo.introducao.controlefluxo;

/***
 * 
 * @author dionatan
 *
 */

public class ControleFluxoExercicio {
	public static void main(String[] args) {

		// Imprime todos numeros pares de 0 até 100000
		int valorPar = 100000;
		for (int i = 0; i <= valorPar; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Imprime todos numeros impares de 0 até 100000
		int valorImpar = 100000;
		for (int i = 0; i <= valorImpar; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
