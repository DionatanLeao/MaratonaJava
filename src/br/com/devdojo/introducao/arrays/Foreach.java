package br.com.devdojo.introducao.arrays;

/***
 * 
 * @author dionatan
 *
 */

public class Foreach {
	public static void main(String[] args) {
//		int[] numeros = new int[5];
		int[] numeros2 = { 1, 2, 3, 4, 5 };
//		int[] numeros3 = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}

		System.out.println("------------------------");

		for (int aux : numeros2) {
			System.out.println(aux);
		}

		String[] nomes = { "juju", "jao jao", "xu xu" };

		System.out.println("------------------------");

		for (String aux : nomes) {
			System.out.println(aux);
		}
	}
}
