package cursojava.DatasEmJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiDeDataComHora {

	public static void main(String[] args){
		
		/*Nova API de data a partir do java 8*/
		
		//Classe pra data
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual: " + localDate);
		
		//Classe pra hora
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Tempo atual: " + horaAtual);
		
		//Classe pra data e hora
		LocalDateTime dataEHoraAtual = LocalDateTime.now();
		System.out.println("Data e hora atual: " + dataEHoraAtual);
		
		// Formantando a com API nova de data
		System.out.println(dataEHoraAtual.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

	}

}
