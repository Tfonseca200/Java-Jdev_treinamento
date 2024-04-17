package curso.java.interfaces;

/* essa interface será o nosso contrato de autenticação */

public interface PermitirAcesso {

	public boolean autenticar();
	public boolean autenticar(String login, String senha);
}
