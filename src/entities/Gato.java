package entities;

import entities.enums.Function;

public class Gato {
	private String cor;
	private String nome;
	private Double tamanho;
	private Double peso;
	private Function funcao;
	
	public Gato() {
		
	}
	
	public Gato(String cor, String nome, Double tamanho, Double peso, Function funcao) {
		this.cor = cor;
		this.nome = nome;
		this.tamanho = tamanho;
		this.peso = peso;
		this.funcao = funcao;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getTamanho() {
		return tamanho;
	}
	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
}
