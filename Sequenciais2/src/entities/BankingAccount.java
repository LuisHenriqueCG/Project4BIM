package entities;

import javax.swing.JOptionPane;

import excpetions.InsuficientBalance;
import interfaces.print;

public abstract class BankingAccount implements print {
	public int accountNumber;
	public double balance;
	
	public double withDraw(double value) throws InsuficientBalance {
		balance -= value;
		return balance - value;
	}
	
	public double deposit(double value) {
		balance += value;
		return balance + value;
	}

	public void transfer(double value, BankingAccount origin, BankingAccount recipient) throws InsuficientBalance {
		origin.withDraw(value);
		recipient.deposit(value);
	}
	
	public void showData(Object e) {
		JOptionPane.showMessageDialog(null, 
				"Account Number: " + accountNumber + "\n" +
				"Balance: " + balance
		);
	}
}
