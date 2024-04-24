package cursojava.DatasEmJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasDoTipoCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());

		
		System.out.println("Calendar em dia da semana:" + (calendar.get(calendar.DAY_OF_WEEK)));
		System.out.println("Calendar em dia do mês: " + (calendar.get(calendar.DAY_OF_MONTH)));
		System.out.println(calendar.get(calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Calendar em dia do ano: " + (calendar.get(calendar.DAY_OF_YEAR)));
		System.out.println("Calendar em horas do dia: " + (calendar.get(calendar.HOUR_OF_DAY)));
		System.out.println("Calendar em minuto: " + (calendar.get(calendar.MINUTE)));
		
		System.out.println(calendar.get(calendar.YEAR));
		
		
		System.out.println("Calendar em Data atual em formato padrão e string: " + simpleDateFormat.format(calendar.getInstance().getTime()));
		
		}
	}


