package cursojava.array_or_matrizes;

import java.util.Arrays;
import java.util.List;

public class SpiltArray {

	public static void main(String[] args) {
		
		String text = "Thiago,curso java,80,70,90,89";
		
		/*tem que ter um padrão ora quebra a string em padrão */ 
		
		String[] valoresArray = text.split(",");
		
		for(int pos = 0; pos < valoresArray.length; pos++) {
		System.out.println(valoresArray[pos]);
		}
		System.out.println("=================================================================");
		/*convertendo um array em uma lista */
		
		List<String> list = Arrays.asList(valoresArray);
		
		for(String valorString : list) {
		System.out.println(valorString);
		}
		
		/* corventendo uma lista para array */
		String []converesaoArray = list.toArray(new String[6]);
		
		System.out.println(converesaoArray);

	}

}
