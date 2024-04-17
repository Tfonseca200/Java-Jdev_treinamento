package cursojava.array_or_matrizes;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayDeDiferentesValores {

	public static void main(String[] args) {
		
		double [] notas = {8.8,9.7,7.6,6.8};
		
		
		/* criação do alunos  */
		Aluno aluno = new Aluno();
		
		aluno.setNome("Thiago fonseca");
		
		
		/* criação da disciplina  */
		Disciplina dis = new Disciplina();
		
		dis.setDisciplina("Java expert");
		dis.setNota(notas);
		
		aluno.getDisciplina().add(dis);
		
		
		System.out.println("Nome do aluno = " + aluno.getNome() );
		for(Disciplina disciplina : aluno.getDisciplina()) {
			System.out.println("------------ Disciplina do aluno ---------------");
			System.out.println("Disciplina do curso: " + disciplina.getDisciplina());
			
			double notaMaxima = 0.0;
			double notaMenor = 0.0;
			
			for(int pos = 0; pos < disciplina.getNota().length; pos ++) {
				System.out.println("Notas " + pos + " é igual = " + disciplina.getNota()[pos]);
				
				
				/* verificando o maior numero do array */
				
				if(pos == 0) {
					notaMaxima = dis.getNota()[pos];
				}else {
					if(dis.getNota()[pos] > notaMaxima) {
						notaMaxima = dis.getNota()[pos];
					}
				}
				
				
				/* verificando o maior numero de array */
				
				if(pos == 0) {
					notaMenor = dis.getNota()[pos];
				}else {
					if(dis.getNota()[pos] < notaMenor) {
						notaMenor = dis.getNota()[pos];
					}
				}
			}
			
			System.out.println("Nota maxima: " + notaMaxima);
			System.out.println("Nota menor: " + notaMenor);
			
		}
	}

}
