package cursojava.executavel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Cordenador;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.StatusAluno;
import cursojava.classes.secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;

public class Main {

    public static void main(String[] args) {

    	try {
    	
    	String login = JOptionPane.showInputDialog("informa o user");
    	String senha = JOptionPane.showInputDialog("informe a senha");
    	
    	
    
    	if(new Cordenador().autenticar(login, senha)) { /* vou travar o contrato para autorizar somente quem reamente tem o contrato elegível*/
    	
    	

        String nomeAluno = JOptionPane.showInputDialog("nome do aluno");
        String cpfDoAluno = JOptionPane.showInputDialog("Cpf do aluno");
        String idade = JOptionPane.showInputDialog("Idade do aluno");
        String serieAluno= JOptionPane.showInputDialog("serie do aluno");

        Aluno aluno = new Aluno();
        
        
       
        aluno.setNome(nomeAluno);
        aluno.setCpf(cpfDoAluno);
        aluno.setIdade(Integer.parseInt(idade));
        aluno.setSerieMatriculado(Integer.parseInt(serieAluno));
        
        List<Aluno>alunos = null;
        
     
        
   
        /* é uma lista que dentro dela tem uma chave que indentifica uma sequencia de valores*/
        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
        
        
        for(int pos = 1 ; pos <= 2; pos++){
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: " + pos +" ?");
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina: " + pos +" ?");
            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            //disciplina.setNota((Double.valueOf(notaDisciplina));

            aluno.getDisciplina().add(disciplina);
        

        int escolha = JOptionPane.showConfirmDialog(null, "deseja remove alguma disciplina? ");

        if(escolha == 0){
        	
        	int continuarRemover = escolha;
        	int posicao = 1;
        	
        	while(continuarRemover == 0) {
            String disciplinaRemover = JOptionPane.showInputDialog("qual disciplina ?");
            aluno.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
            posicao++;
            continuarRemover = JOptionPane.showConfirmDialog(null, "Continual a remover");
        	}
        }
        
        alunos.add(aluno);
        
        }
        
        maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
        maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
        maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
        
        for(Aluno alunoList: alunos) {
        	
        	if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
        		maps.get(StatusAluno.APROVADO).add(aluno);
        	}
        	
        	else if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
        		maps.get(StatusAluno.RECUPERACAO).add(aluno);
        	}
        	
        	else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)){
        		maps.get(StatusAluno.REPROVADO).add(aluno);
        	}
        }
    
        System.out.println("---------------lista do aprovados------------------");
        
        for(Aluno aluno_list : maps.get(StatusAluno.APROVADO)) {
        	System.out.println("nome: " + aluno.getNome() + " ,Com media de: " + aluno.getMedia() + " ,Status do ano letivo: " + aluno.getAlunoAprovado());
        	}
        
        System.out.println("---------------lista de Recuperação------------------");
        
        for(Aluno aluno_list : maps.get(StatusAluno.RECUPERACAO)) {
        	System.out.println("nome: " + aluno.getNome() + " ,Com media de: " + aluno.getMedia() + " ,Status do ano letivo: " + aluno.getAlunoAprovado());
        	}
        
        System.out.println("---------------lista dos Reprovados------------------");
        
        for(Aluno aluno_list : maps.get(StatusAluno.REPROVADO)) {
        	System.out.println("nome: " + aluno.getNome() + " , Disciplina: " + aluno.getDisciplina() + " ,Com media de: " + aluno.getMedia() + " ,Status do ano letivo: " + aluno.getAlunoAprovado());
        	}
        
        
        

        System.out.println(aluno.getNome());
        System.out.println(aluno.getCpf());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getSerieMatriculado() + "\n");
        System.out.println("Media do aluno: " + aluno.getMedia());
        System.out.println(aluno.getAlunoAprovado());
        System.out.println(aluno.getDisciplina());
        
    		}else {
    			JOptionPane.showMessageDialog(null,"User ou senha incorreto, por motivo de seguranças vamos encerrar");
    		}
    	}catch (Exception e) {
    		
    		StringBuilder saida = new StringBuilder();
    		
			e.printStackTrace();
			
			for(int i = 0; i <= e.getStackTrace().length; i++) {
				saida.append("\nClasse de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\nMétodo de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\nLinha do erro: " + e.getStackTrace()[1].getLineNumber());
				
			}
			JOptionPane.showMessageDialog(null, "erro ao processar notas" + saida.toString());
			}
    }
    
}

