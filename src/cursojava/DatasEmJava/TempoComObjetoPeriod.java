package cursojava.DatasEmJava;

import java.time.LocalDate;
import java.time.Period;

public class TempoComObjetoPeriod {

	public static void main(String[] args) {
		
		// Adicionando data no LocalDate
		LocalDate dataAntiga = LocalDate.of(1995, 8, 07);
		
		LocalDate dataNova = LocalDate.of(2024, 04, 24);
		
		//Comparado Datas com LocalDate
		System.out.println("data antiga é maior que data nova? " + dataAntiga.isAfter(dataNova));
		
		System.out.println("data antiga é maior que data nova? " + dataAntiga.isBefore(dataNova));
		
		System.out.println("data antiga é maior que data nova? " + dataAntiga.isEqual(dataNova));
		
		//Classe Period
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("======================================================");
		System.out.println("Quantas dias entre as datas do periodos : " + periodo.getDays());
		System.out.println("Quantas meses entre as datas do periodos : " + periodo.getMonths());
		System.out.println("Quantas meses entre as datas do periodos : " + periodo.getYears());
		
		System.out.println("Periodo exato entre as datas: " + periodo.getDays() +" dias "
							+ periodo.getMonths() + " meses e " + periodo.getYears() + " anos ");
		
		System.out.println("Total de meses: " + periodo.toTotalMonths());

	}

}
