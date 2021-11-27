package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JOptionPane;

public class BakingAccount {
	double saldo = 10000;
	DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	
	public void extractByPeriod (LocalDate initialDate, LocalDate finalDate) throws Exceptions {
		String message = "EXTRATO DE " + formater.format(initialDate) + " à " + formater.format(finalDate);
		JOptionPane.showMessageDialog(null, message + "\n **Lista de transações** " + "\n Seu saldo atual: " + saldo);
		
		if (initialDate.compareTo(finalDate) >= 0) {
			throw new Exceptions("Data inválida. Por favor, verifique!");
		}
	}
	public void getBankBalanceByDate(LocalDate date) throws Exceptions {
		
		if (date.compareTo(LocalDate.now()) == 0) {
			throw new Exceptions("Data não informada. Por favor, informe uma data!");
		}
	}
	public void cashOut(double value) throws Exceptions {
		saldo -= value;
		if (value < 0) {
			throw new Exceptions("Valor de saque inválido. Por favor verifique!");
		}
	}
}
