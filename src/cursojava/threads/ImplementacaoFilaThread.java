package cursojava.threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha =
			                new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		Iterator iteracao = pilha_filha.iterator();
		
		synchronized (iteracao) { /*Bloquea o acesso a esta lista por outro processo */
			
		}
		while(iteracao.hasNext()) { /*Enquanto conter dados na lista irá processar */
			
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
			
			/* Processar 10 mil notas fiscal */
			/* Gerar uma lista de PDF*/
			/* gerar um envio em massa de Email */
			
			System.out.println("-------------------------------------------");
			System.out.println(processar.getNome());
			System.out.println(processar.getEmail());
			
			iteracao.remove();
			
			try {
				Thread.sleep(100); /* Dá um tempo pra descarga de memoria */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		super.run();
	}

}
