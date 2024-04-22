package cursojava.DatasEmJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasDoTipoDate {
	
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Dia do mês: " + date.getDate());
		System.out.println("dia da semana: " + date.getDay());
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Mininutos: " + date.getMinutes());
		System.out.println("Segundos: " + date.getSeconds());
		System.out.println("Ano: " + (1900 + date.getYear()));
		
		
		/* --------------------------------------------------- */
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato pradrão de string: " + simpleDateFormat.format(date));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("Objeto date:" + simpleDateFormat.parse("2050/01/01"));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto date:" + simpleDateFormat.parse("04/10/2001"));
		
		if(simpleDateFormat.format(date).equals("22/04/2024")) {
			System.out.println("Data correspodente");
		}
	}
	
	
	
	

}
