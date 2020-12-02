package br.com.devdojo.javacore.test;

import br.com.devdojo.javacore.metodos.Calculadora;

/***
 * 
 * @author dionatan
 *
 */

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.somar(1, 1));
		System.out.println(calculadora.subtrair(1, 1));
		System.out.println(calculadora.multiplicar(1, 1));
		System.out.println(calculadora.dividir(1, 1));
		System.out.println(calculadora.resto(3, 2));
	}

}
