import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        

        String nomeAluno = JOptionPane.showInputDialog("nome do aluno");
        String cpfDoAluno = JOptionPane.showInputDialog("Cpf do aluno");
        String idade = JOptionPane.showInputDialog("Idade do aluno");
        String serieAluno= JOptionPane.showInputDialog("serie do aluno");

        Aluno aluno = new Aluno();
        
        
        aluno.setNome(nomeAluno);
        aluno.setCpf(cpfDoAluno);
        aluno.setIdade(Integer.parseInt(idade));
        aluno.setSerieEcolar(serieAluno);

        for(int pos = 1 ; pos <= 2; pos++){
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: " + pos +" ?");
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina: " + pos +" ?");
            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));

            aluno.getDisciplina().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null, "deseja remove alguma disciplina? ");

        if(escolha == 0){
            String disciplinaRemover = JOptionPane.showInputDialog("qual disciplina 1 ou 2 ?");
            aluno.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
        }


        System.out.println(aluno.getNome());
        System.out.println(aluno.getCpf());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getSerieEcolar());
        System.err.println("Media do aluno: " + aluno.getMedia());
        System.out.println(aluno.getAlunoAprovado());
        System.out.println(aluno.getDisciplina());
        
        
    }
    
}
