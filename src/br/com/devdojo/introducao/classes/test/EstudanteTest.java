package br.com.devdojo.introducao.classes.test;

import br.com.devdojo.introducao.classes.Estudante;

/***
 * 
 * @author dionatan
 *
 */

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		estudante.setNome("Rolando Lero");
		estudante.setMatricula("Ensino Médio 1° ano A");
		estudante.setIdade(13);
		System.out.println(estudante.getNome());
		System.out.println(estudante.getMatricula());
		System.out.println(estudante.getIdade() + " anos");
		
	}

}
