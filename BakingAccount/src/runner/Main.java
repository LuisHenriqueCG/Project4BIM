package runner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;
import models.BakingAccount;

public class Main {
	public static void main(String[] args) throws Throwable {
		BakingAccount conta = new BakingAccount();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/YYYY");
		String dataInicial = "2021/10/09";
		String dataFinal = "2021/20/11";
		
		conta.extractByPeriod(LocalDate.parse(dataInicial, formatter), LocalDate.parse(dataFinal, formatter));
	}
}
