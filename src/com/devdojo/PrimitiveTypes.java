package com.devdojo;

import com.devdojo.entity.Pessoa;
import com.devdojo.entity.Trabalhador;
import com.devdojo.entity.enums.EstadoCivil;
import com.devdojo.entity.enums.Sexo;

/***
 * 
 * @author dionatan
 *
 */
public class PrimitiveTypes {
	public static void main(String[] args) {

		/***
		 * Tipos Primitivos
		 */
		int inteiro = 10;
		double duplo = 3000;
		float flutuante = 3000;
		boolean booleanoTrue = true;
		boolean booleanoFalse = false;
		char caracteres = 'A';
		byte bytes = 12;
		short curto = 32767;
		long longo = 1000L;
		String nome = "Dionatan \n";

		System.out.println("int: " + inteiro);
		System.out.println("double: " + duplo);
		System.out.println("float: " + flutuante);
		System.out.println("boolean com retorno true: " + booleanoTrue);
		System.out.println("boolean com retorno false: " + booleanoFalse);
		System.out.println("char: " + caracteres);
		System.out.println("byte: " + bytes);
		System.out.println("short: " + curto);
		System.out.println("long: " + longo);
		System.out.println("String: " + nome);

		System.out.println("-------------------- Exercício 01 ---------------------------- \n");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("João");
		pessoa.setEndereco("Rua A, número 0, Pindamonhangaba-SP");
		pessoa.setTelefone("(00) 90000-0000");

		System.out.println("O " + pessoa.getNome() + " domiciliado no endereço " + pessoa.getEndereco()
				+ "\ne telefone " + pessoa.getTelefone() + " não possui nenhum tipo de pendência.");

		System.out.println("\n-------------------- Exercício 02 ---------------------------- \n");

		Trabalhador trabalhador = new Trabalhador();
		trabalhador.setNome("Maria");
		trabalhador.setSalario(3000);
		trabalhador.setSexo(Sexo.feminino);
		trabalhador.setIdade(23);
		trabalhador.setEstadoCivil(EstadoCivil.solteiro);

		System.out.println("O(A) Trabalhador(a) " + trabalhador.getNome() + " do sexo " + trabalhador.getSexo()
				+ ", idade " + trabalhador.getIdade() + " anos," + " estado civil " + trabalhador.getEstadoCivil()
				+ " e salário de " + trabalhador.getSalario() + " \nencontra-se empregado neste estabelecimento.");

	}

}
