package br.com.devdojo.introducao.entity;

import br.com.devdojo.introducao.enums.EstadoCivil;
import br.com.devdojo.introducao.enums.Sexo;

/***
 * 
 * @author dionatan
 *
 */

public class Trabalhador {

	private String nome;
	private float salario;
	private Sexo sexo;
	private Integer idade;
	private EstadoCivil estadoCivil;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
