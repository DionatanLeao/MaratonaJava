package br.com.devdojo.javacore.test;

import br.com.devdojo.javacore.classes.Professor;

/***
 * 
 * @author dionatan
 *
 */

public class ProfessorTest {
	public static void main(String[] args) {

		Professor professor = new Professor();
		professor.setNome("Maria de Paiva");
		professor.setMatricula(123456);
		professor.setRg("1234-567");
		professor.setCpf("123456789-00");

		System.out.println(professor.getNome());
		System.out.println(professor.getMatricula());
		System.out.println(professor.getRg());
		System.out.println(professor.getCpf());
		
		System.out.println("\n------------------------------------\n");

		Professor professor2 = new Professor();
		professor2.setNome("Joana de Paula");
		professor2.setMatricula(123456);
		professor2.setRg("0987-654");
		professor2.setCpf("987654321-00");

		System.out.println(professor2.getNome());
		System.out.println(professor2.getMatricula());
		System.out.println(professor2.getRg());
		System.out.println(professor2.getCpf());

	}
}
