package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cursojava.classes.Pessoa;


public class Arquivos {
	
	public static void main(String[] args) throws IOException {
		
		
	Pessoa pessoa1 = new Pessoa();
	pessoa1.setNome("Thiago");
	pessoa1.setIdade(22);
	
	Pessoa pessoa2 = new Pessoa();
	pessoa2.setNome("Lucas");
	pessoa2.setIdade(29);
	
	Pessoa pessoa3 = new Pessoa();
	pessoa3.setNome("Diego");
	pessoa3.setIdade(20);
	
	Pessoa pessoa4 = new Pessoa();
	pessoa4.setNome("Mônica");
	pessoa4.setIdade(40);
	
	List<Pessoa> pessoaList = new ArrayList<Pessoa>();
	pessoaList.add(pessoa1);
	pessoaList.add(pessoa2);
	pessoaList.add(pessoa3);
	pessoaList.add(pessoa4);	
		
		File arquivo = new File("/home/thiago/Jdev_treinamentos/Java_Basic/src/cursojava/arquivos/arquivo.txt");
				
				if(!arquivo.exists()) {
					arquivo.createNewFile();
				}
				
				
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for(Pessoa pessoas : pessoaList) {
			escrever_no_arquivo.write(pessoas.getNome() + ";" + pessoas.getIdade() + "\n");
		}
		
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
				}
	
	}



