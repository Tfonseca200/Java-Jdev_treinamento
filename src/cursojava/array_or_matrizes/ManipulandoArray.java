package cursojava.array_or_matrizes;

import javax.swing.JOptionPane;

public class ManipulandoArray {

	public static void main(String[] args) {
		
		String posicoes = JOptionPane.showInputDialog("quantas posições o array deve ter? ");
		
		
		Double[] array = new Double[Integer.parseInt(posicoes)];
		
		for (int  i = 0 ; i < array.length; i++) {
			String valor = JOptionPane.showInputDialog(null, "Digite a posição do index " + (i+1));
			array[i] = Double.parseDouble(valor);
		}
		
		
		Double somaArray = 0.0;
		for(int i = 0; i < array.length; i++) {
			somaArray += array[i];
			System.out.println("index:" + (i + 1) + " valor do index: " + array[i] );
		}
		
		JOptionPane.showMessageDialog(null, "valor total do elementos %f.2f%" + somaArray);
		
	}
	
}
