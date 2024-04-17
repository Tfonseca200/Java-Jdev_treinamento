package cursojava.array_or_matrizes;

public class Matrizes {

	public static void main(String[] args) {
		
		int [][] notas = new int [2][3];

		notas[0][0] = 200;
		notas[0][1] = 200;
		notas[0][2] = 200;
		notas[1][0] = 200;
		notas[1][1] = 200;
		notas[1][2] = 200;
		
		
		
		int somaTotal = 0;
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j <= notas.length ; j++) {
				System.out.println(notas[i][j]);
				
				somaTotal += notas[i][j];
			}
		}
		
		System.out.println("soma total: " + somaTotal);
	}

}
