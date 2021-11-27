package entities;

import interfaces.print;

public class Bank implements print {
	BankingAccount[] accountsList;

	@Override
	public void showData() {
		for (int i = 0; i < accountsList.length - 1; i++) {
			accountsList[i].showData();
		}	
	}
}
