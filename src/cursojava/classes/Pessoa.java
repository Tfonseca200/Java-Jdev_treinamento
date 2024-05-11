package cursojava.classes;

 /* Classe pai pu classe master ou superclasse*/

public class Pessoa {
	

	protected String nome;
	protected int idade;
	protected String dataDeNascimento;
	protected String registroGeral;
	protected String cpf;
	protected String nomePai;
	protected String nomeMae;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getRegistroGeral() {
		return registroGeral;
	}
	
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {

		this.nomeMae = nomeMae;
	}

	
	
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
	public String msmDeMaioridade() {
		return this.pessoaMaiorIdade() ? "Liberado , é maior de idade" : "Negado, menor de idade";
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	

	
	
	
	
	
	}

