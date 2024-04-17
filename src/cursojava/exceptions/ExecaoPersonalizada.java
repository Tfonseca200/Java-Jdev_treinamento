package cursojava.exceptions;

public class ExecaoPersonalizada extends Exception{
	
	public ExecaoPersonalizada(String erro) {
		super("erro ao ler arquivo ou está existente" + erro);
		
		
	}

	

}
