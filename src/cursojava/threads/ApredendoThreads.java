package cursojava.threads;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class ApredendoThreads {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadDisparoDeEmail = new Thread(thread1);
		threadDisparoDeEmail.start();
			
			
		/* Codigo da rotina que eu quero executrar em pararelo */

		/* Codigo do sistema do usuário continuo o fluxo de trabalho */
		int soma =  20 + 10;
		JOptionPane.showMessageDialog(null, "Soma dos produtos: " + soma);
		
		/* **************************************************************************************** */
		
		// thread de processamento em pararelo
		Thread threadDisparoDeNf = new Thread(thread1);
		threadDisparoDeNf.start();
	}
	
	
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			for(int pos = 0 ; pos < 10; pos++) {
				
				
				/* Quero executar esse envio com um tempo de parada, ou com um tempo determinado */
				System.out.println("executando algo rotina, por exemplo envio de e-email # : " + (pos + 1));
				System.out.println("-----------------------------------------------------------------------");
				
				try {
					Thread.sleep(3000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			JOptionPane.showMessageDialog(null, "FINALIZOU A THREAD DO 3S");
			
			
		}
	};
	
	
	
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			for(int pos = 0 ; pos < 10; pos++) {
				
				
				/* Quero executar esse envio com um tempo de parada, ou com um tempo determinado */
				System.out.println("executando algo rotina, por exemplo envio de nota fiscal *: " + (pos + 1));
				System.out.println("-----------------------------------------------------------------------");
				
				try {
					Thread.sleep(5000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			JOptionPane.showMessageDialog(null, "FINALIZOU A THREAD DO 1S");
			
			
		}
			
	};
	

}
