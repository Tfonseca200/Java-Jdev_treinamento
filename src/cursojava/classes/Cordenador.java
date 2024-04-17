package cursojava.classes;

import curso.java.interfaces.AcessoCordenacao;

public class Cordenador extends Pessoa implements AcessoCordenacao{
	
	private String credecialCordenador;
	private String login;
	private String senha;
	
	public Cordenador() {}
	
	public Cordenador(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autenticar(String login,String senha) {
		return login.equals("cord") && senha.equals("123");
	}
	
	
	
	

}
