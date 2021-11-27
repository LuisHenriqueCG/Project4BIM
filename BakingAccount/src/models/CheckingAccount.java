package models;

public class CheckingAccount extends BakingAccount {
	private final double SPECIAL_LIMIT = 500;
	
	public double getOverDraftLimit() {
		return SPECIAL_LIMIT;
	}
}
