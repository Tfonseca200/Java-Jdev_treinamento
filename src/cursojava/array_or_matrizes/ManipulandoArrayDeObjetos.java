package cursojava.array_or_matrizes;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ManipulandoArrayDeObjetos {

	public static void main(String[] args) {
		
		
	double [] notas = {8.8,9.7,7.6,6.8};
	int [] notaInteiros = {3,5,8,9,3};
		
		
		/* criação do alunos  */
		Aluno aluno = new Aluno();
		
		aluno.setNome("Thiago fonseca");
		aluno.setRegistroGeral("491.650.828.93");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("temeri kavalski");
		aluno1.setRegistroGeral("732.584.983-84");
		
		
		/* criação da disciplina  */
		Disciplina dis = new Disciplina();
		
		dis.setDisciplina("Java expert");
		dis.setNota(notas);
		
		aluno.getDisciplina().add(dis);
		
	
		
		

		Aluno [] alunos = new Aluno[2];
		
		alunos[0] = aluno;
		alunos[1] = aluno1;
		
		for(int i = 0; i < alunos.length; i ++) {
			System.out.println("Nome do aluno: " + alunos[i].getNome());
			System.out.println("Cpf: " + alunos[i].getRegistroGeral());
			
			for( Disciplina d : alunos[i].getDisciplina()) {
				System.out.println("Nome da disciplina: " + d.getDisciplina());
				
				
				for(int pos = 0; pos < d.getNota().length; pos++) {
					System.out.println("Notas " + (pos + 1) + " é igual a " + d.getNota()[pos]);
				}
			}
		}
	}

}
