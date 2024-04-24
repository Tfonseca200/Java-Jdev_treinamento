package cursojava.DatasEmJava;

import java.time.LocalDate;

public class AdicionandoDatasComLocaDate {

	public static void main(String[] args) {
		

		LocalDate dataBase = LocalDate.parse("2024-04-01");
		
		//Adicionando dias, semanas , meses e anos em uma data com plus
		
		System.out.println("Adicionado 5 dias na data: " + (dataBase = dataBase.plusDays(5)));
		
		System.out.println("Adicionado 5 semanas na data: " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Adicionado 5 meses na data: " + (dataBase = dataBase.plusMonths(5)));
		
		System.out.println("Adicionado 5 anos na data: " + (dataBase = dataBase.plusYears(5)));
		
		
		// Removendo dias, semanas, mese e anos em uma data com Minus
		System.out.println("removendo 5 na data: " + (dataBase = dataBase.minusDays(5)));

	}

}
