package cursojava.DatasEmJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataAfterEBefore {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFromat = new SimpleDateFormat("yyyy/MM/dd");
		
		Date dataDeVenciemento = simpleDateFromat.parse("24/04/2024");
		
		Date dataAtualDeHoje =  simpleDateFromat.parse("24/04/2024");
		
		//Before: Se data 1 é menor que a 1 */
		
		// After: Se data 1 é maior que a 2 */
		
		if (dataDeVenciemento.after(dataAtualDeHoje) || dataDeVenciemento.equals(dataAtualDeHoje)) {
			System.out.println("Boleto valido pra pagamento");
		}else {
			System.out.println("Boleto não valido pra pagamento");
		}

	}

}
