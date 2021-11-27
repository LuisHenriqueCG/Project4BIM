package excpetions;

public class InsuficientBalance extends Throwable {
	private static final long serialVersionUID = 1L;
	
	public InsuficientBalance(String message) {
		super(message);
	}
}
