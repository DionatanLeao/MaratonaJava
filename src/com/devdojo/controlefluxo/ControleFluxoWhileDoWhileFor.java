package com.devdojo.controlefluxo;

/***
 * 
 * @author dionatan
 *
 */

public class ControleFluxoWhileDoWhileFor {
	public static void main(String[] args) {

		int contador = 0;

		while (contador < 10) {
			System.out.println(++contador);
		}
		
		contador = 0;

		do {
			System.out.println("\nDentro do do while: " + contador++ + "\n");
		} while (contador < 10);

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}
	}
}
