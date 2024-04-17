package cursojava.classes;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{

    
 
	private String dataMatriculada;
    private String nomeEscola;
    private int serieMatriculado;
    private List <Disciplina> Disciplina = new ArrayList <Disciplina>();

    public Aluno(){

    }
	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        super.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        super.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        super.idade = idade;
    }


    public int getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(int serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public List<Disciplina> getDisciplina() {
        return Disciplina;
    }



    public void setDisciplina(List<Disciplina> getDisciplina) {
        this.Disciplina = getDisciplina;
    }


    public Double getMedia() {

        double somaNotas  = 0.0;

        for(Disciplina disciplina : Disciplina){
            somaNotas += disciplina.getMediaNotas();
        }
        return somaNotas / Disciplina.size();
        
    }

    public String getAlunoAprovado(){ 

        Double media = this.getMedia();

        if(media >= 5){
            if (media >= 7) {
                return StatusAluno.APROVADO;
                }
                else{
                    return StatusAluno.RECUPERACAO;
                }
        }else{
            return StatusAluno.REPROVADO;
        }
          
    }
    
    
    public boolean passouDeSerie() {

    	if(getMedia() > 7) {
    		return true;
    	}else{
    		return false;
    	}
    }
    
	@Override
	public String toString() {
		return "Aluno [dataMatriculada=" + dataMatriculada + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", Disciplina=" + Disciplina + ", nome=" + nome + ", idade=" + idade
				+ ", dataDeNascimento=" + dataDeNascimento + ", registroGeral=" + registroGeral + ", cpf=" + cpf
				+ ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + "]";
	}
	
	
    
  



    

}
