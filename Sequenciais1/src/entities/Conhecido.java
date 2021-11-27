package entities;

public class Conhecido extends Pessoa {
	String email;
	
	//Construtores
	Conhecido() {
		email = "indefinido";
	}
	//*******************************
	
	
	//Getters and Setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//*******************************
}
