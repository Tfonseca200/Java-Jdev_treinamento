package cursojava.classes;

import curso.java.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{
	
	
	
	private String resgistroEducacao;
	private int tempoDirecao;
	private String titulacao;
	private String login;
	private String senha;
	
	public Diretor() {}
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	
	public String getResgistroEducacao() {
		return resgistroEducacao;
	}
	public void setResgistroEducacao(String resgistroEducacao) {
		this.resgistroEducacao = resgistroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
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
	public String toString() {
		return "Diretor [resgistroEducacao=" + resgistroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataDeNascimento=" + dataDeNascimento
				+ ", registroGeral=" + registroGeral + ", cpf=" + cpf + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ "]";
	}
	
	
	@Override
	public boolean autenticar(String login,String senha) {
		this.login = login;
		this.senha = senha;
		return login.equals("admin") && senha.equals("admin");
	}
	
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
	
	
	

	
	
}
