package com.devdojo.controlefluxo;

/***
 * 
 * @author dionatan
 *
 */

public class ControleFluxoSwitch {
	public static void main(String[] args) {
		
		byte dia = 5;
		
		// char, int, byte, short, emun e String
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			break;
		}
	}
}