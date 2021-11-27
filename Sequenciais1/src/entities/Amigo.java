package entities;

import java.time.LocalDate;

public class Amigo extends Pessoa {
	LocalDate dataNascimento;
	
	// Construtor
	Amigo() {
		dataNascimento = LocalDate.parse("00/00/0000");
	}
	//********************************
	
	//Getters and Setters
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	//********************************	
}
