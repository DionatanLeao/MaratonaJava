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

	}
}
