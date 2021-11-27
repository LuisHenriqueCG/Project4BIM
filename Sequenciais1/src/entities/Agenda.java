package entities;

public class Agenda {
	Pessoa[] listaPessoas;
	int qtdAmigos;
	int qtdConhecidos;
	
	Agenda(int capacidadeMaximaAgenda) {
		listaPessoas = new Pessoa[capacidadeMaximaAgenda];
		for (int i = 0; i < listaPessoas.length - 1; i++) {
			
		}
	}
}
