package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.secretario;


public class TesntandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("thiago fonseca claudino");
		aluno.setDataDeNascimento("04/10/2001");
		aluno.setIdade(16);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("76283648929");
		diretor.setNome("thiago");
		diretor.setIdade(28);
		
		secretario secretario = new  secretario();
		secretario.setExperiencia("alguma experiencia");
		secretario.setCpf("36364842283");
		secretario.setIdade(43);
		
		System.out.println(aluno + "/n");
		System.out.println(diretor + "/n");
		System.out.println(secretario + "/n");
		
		System.out.println(aluno.pessoaMaiorIdade() + "| " + aluno.msmDeMaioridade());
		System.out.println(diretor.pessoaMaiorIdade()+ "| " + aluno.msmDeMaioridade());
		System.out.println(secretario.pessoaMaiorIdade()+ "| " + aluno.msmDeMaioridade());
	
		
		
		

	}

}
