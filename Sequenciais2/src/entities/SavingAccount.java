package entities;

import javax.swing.JOptionPane;

import excpetions.InsuficientBalance;

public class SavingAccount extends BankingAccount {
	private final double CREDIT_LIMIT = 1000.00;
	
	@Override
	public double withDraw(double value) throws InsuficientBalance {
		if (value > super.balance) {
			throw new InsuficientBalance("Saldo insuficiente. Por favor, digite outro valor");
		}
		super.balance -= value;
		return balance - value;
	}
	
	@Override
	public void showData() {
		JOptionPane.showMessageDialog(null, CREDIT_LIMIT);
	}
}
