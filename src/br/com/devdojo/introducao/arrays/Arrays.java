package br.com.devdojo.introducao.arrays;

/***
 * 
 * @author dionatan
 *
 */

public class Arrays {
	public static void main(String[] args) {
		int[] idades = new int[3];

		idades[0] = 30;
		idades[1] = 31;
		idades[2] = 32;

		System.out.println("idade 1: " + idades[0]);
		System.out.println("idade 2: " + idades[1]);
		System.out.println("idade 3: " + idades[2]);
		
		System.out.println("-------------------------------------");

		String[] nomes = new String[3];
		nomes[0] = "Maria";
		nomes[1] = "João";
		nomes[2] = "Manoel";

		for (int i = 0; i < nomes.length; i++) {
			System.out.println((i+1) + " " + nomes[i]);
		}
	}

}
