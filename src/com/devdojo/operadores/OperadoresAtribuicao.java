package com.devdojo.operadores;

/***
 * 
 * @author dionatan
 *
 */

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		// =, -=, +=, *=, /=, %=
		int salario = 1800;
		int numero = 11;
		
		salario = salario + 1000;
		salario += 1000;
		salario *= 0.1;
		
		numero %= 2;
		
		System.out.println(salario);
		System.out.println(numero);
	}
}
