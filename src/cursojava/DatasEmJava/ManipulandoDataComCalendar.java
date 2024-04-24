package cursojava.DatasEmJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ManipulandoDataComCalendar {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); //Pega data atual
		
		/*Simula que a data vem do banco de dados */
		
		calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2024-04-23")); // Definindo uma data qualquer
		
		//Metódo de soma de dia
		calendar.add(calendar.DAY_OF_MONTH, 8);  // Adicionando 5 dias a data 
		
		System.out.println("Data formatada: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		//Metódo de soma de meses
		calendar.add(calendar.MONTH, 1);
		
		System.out.println("somando 1 mẽs: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		//Metódo de soma de anos
		calendar.add(calendar.YEAR, 1);
		
		System.out.println("somando 1 ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

	}

}
