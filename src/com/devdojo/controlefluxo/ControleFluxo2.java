package com.devdojo.controlefluxo;

/***
 * 
 * @author dionatan
 *
 */

public class ControleFluxo2 {

	public static void main(String[] args) {
		// ? if : else
		int idade = 20;
		String status;
		
		status = idade >= 18 ? "Adulto" : "Não Adulto";
		
		System.out.println(status);
		
		System.out.println("------------------- Exercício ---------------------");
		
		double salario = 3600;
		double totalImposto = 0;
		
		if(salario < 1000) {
			totalImposto = salario * 0.05;
		}
		else if(salario >=1000 && salario <2000) {
			totalImposto = salario * 0.1;
		}
		else if(salario >= 2000 && salario < 4000) {
			totalImposto = salario * 0.15;
		}
		else {
			totalImposto = salario * 0.2;
		}
		
		System.out.println(totalImposto);
	}
}
