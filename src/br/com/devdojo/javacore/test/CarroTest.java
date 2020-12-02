package br.com.devdojo.javacore.test;

import br.com.devdojo.javacore.classes.Carro;

/***
 * 
 * @author dionatan
 *
 */

public class CarroTest {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setPlaca("AAA-0000");
		carro.setModelo("Honda");
		carro.setVelocidade(200f);

		System.out.println(carro.getPlaca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getVelocidade());
	}
}
