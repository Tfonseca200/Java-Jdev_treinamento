import java.util.ArrayList;
import java.util.List;

public class Aluno {

    
    private String nome;
    private String cpf;
    private int idade;
    private String serieEcolar;

    private List <Disciplina> Disciplina = new ArrayList <Disciplina>();

    public Aluno(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSerieEcolar() {
        return serieEcolar;
    }

    public void setSerieEcolar(String serieEcolar) {
        this.serieEcolar = serieEcolar;
    }



    public List<Disciplina> getDisciplina() {
        return Disciplina;
    }



    public void setDisciplina(List<Disciplina> getDisciplina) {
        this.Disciplina = getDisciplina;
    }


    public Double getMedia() {

        double somaNota = 0.0;

        for(Disciplina disciplina : Disciplina){
            somaNota += disciplina.getNota();
        }
        return somaNota / Disciplina.size();
    }

    public String getAlunoAprovado(){ 

        Double media = this.getMedia();

        if(media >= 50){
            if (media >= 70) {
                return "Aluno aprovado";
                }
                else{
                    return "Aluno de recuperação";
                }
        }else{
            return "Aluno reprovado";
        }
          
    }

    

}
