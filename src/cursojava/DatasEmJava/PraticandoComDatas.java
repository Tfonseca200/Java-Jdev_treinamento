package cursojava.DatasEmJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class PraticandoComDatas {

	public static void main(String[] args) throws ParseException {
		
		String data = "01/05/2024";
		
		Date dataInical = new SimpleDateFormat("dd/MM/yyy").parse(data);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInical);
		
		
		int parcelas = 7;
		for(int i = 1; i <= parcelas; i++) {
			if(i < 10) {
			System.out.println("Data numero:"+ i + "   " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			}else{
				System.out.println("Data numero:"+ i + "  " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			}
			calendar.add(calendar.MONTH, 1);
		}

	}

}
