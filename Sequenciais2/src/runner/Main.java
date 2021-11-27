package runner;

import entities.BankingAccount;
import entities.CurrentAccount;
import entities.Report;
import entities.SavingAccount;
import excpetions.InsuficientBalance;

public class Main {
	public static void main(String[] args) {
		BankingAccount savingAccount = new SavingAccount();
		BankingAccount currentAccount = new CurrentAccount();
		Report report = new Report();
		
		savingAccount.accountNumber = 1;
		currentAccount.accountNumber = 2;
		
		savingAccount.deposit(5400.00);
		currentAccount.deposit(10000.00);
		
		try {
			savingAccount.withDraw(5500.00);
		} catch (InsuficientBalance e) {
			e.printStackTrace();
		}
		try {
			currentAccount.withDraw(500.00);
		} catch (InsuficientBalance e) {
			e.printStackTrace();
		}
		
		report.createReport(savingAccount);
		report.createReport(currentAccount);
	}
}
