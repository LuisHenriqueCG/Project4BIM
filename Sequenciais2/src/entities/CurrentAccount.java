package entities;

import javax.swing.JOptionPane;

import excpetions.InsuficientBalance;

public class CurrentAccount extends BankingAccount {
	private final double OPPERATION_FEE = 0.15;
	private final double CREDIT_LIMIT = balance*0.15;

	@Override
	public double withDraw(double value) throws InsuficientBalance {
		if (value > balance + CREDIT_LIMIT) {
			throw new InsuficientBalance("Valor ultrapassa saldo e limite. Por favor ");
		}
		balance -= OPPERATION_FEE + value;
		return balance - (OPPERATION_FEE + value);
	}
	
	@Override
	public void showData() {
		JOptionPane.showMessageDialog(null, OPPERATION_FEE);
	}
}
