package cursojava.DatasEmJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TempoComChronoUnit {

	public static void main(String[] args) throws ParseException {
		
		Date dataPassada = new SimpleDateFormat("dd-MM-yyyy").parse("01-05-2024");
		
		//Usado pra saber a quantidade de dias entre os as datas comparadas
		Long dias = ChronoUnit.DAYS.between(LocalDate.parse("2024-05-01"), LocalDate.parse("2024-05-06")); // return um Long
		
		System.out.println("a data 1 possui a diferença de " + dias + " dias da data 2");

	}

}
