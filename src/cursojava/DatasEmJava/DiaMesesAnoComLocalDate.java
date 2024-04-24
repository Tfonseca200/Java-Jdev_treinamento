package cursojava.DatasEmJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesesAnoComLocalDate {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		// formatando data com LocalDate
		System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek());
		
		System.out.println("Dia do mês: " + localDate.getDayOfMonth());
		
		System.out.println("Dia do ano: " + localDate.getDayOfYear());
		
		System.out.println("Mês atual: " + localDate.getMonthValue());
		
		System.out.println("Mês atual inscrito: " + localDate.getMonth());
		
		System.out.println("Ano atual: "  + localDate.getYear());
	}

}
