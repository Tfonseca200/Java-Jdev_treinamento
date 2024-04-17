package cursojava.classes;

import curso.java.interfaces.PermitirAcesso;

public class secretario extends Pessoa implements PermitirAcesso{
	
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	private String login;
	private String senha;
	
	public secretario() {
		
	}
	
	public secretario(String login,String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
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
		return "secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataDeNascimento=" + dataDeNascimento + ", registroGeral="
				+ registroGeral + ", cpf=" + cpf + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + "]";
	}
	
	/* esse é o médoto do contrato de autenticação */
	
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
