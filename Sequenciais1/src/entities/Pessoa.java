package entities;

public class Pessoa {
	String nome;
	int idade;
	
	// Construtores
	Pessoa(String nome, int idade) {
		
	}
	Pessoa() {
		nome = "indefinido";
		idade = 0;
	}
	//*******************************
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//*******************************
}
