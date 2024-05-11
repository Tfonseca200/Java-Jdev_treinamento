package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

import cursojava.classes.Pessoa;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		// entrada de dados do arquivo pro java
		FileInputStream entradaDeArquivo = new FileInputStream(
				new File("/home/thiago/Jdev_treinamentos/Java_Basic/src/cursojava/arquivos/arquivo.txt"));

		// lendo arquivo com Scanner
		Scanner lerArquivo = new Scanner(entradaDeArquivo, "UTF-8");

		List<Pessoa> pessoasList = new ArrayList<Pessoa>();

		// executando um loop pra pegar todas as linha do arquivo
		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();

			if (linha != null && !linha.isEmpty()) {

				System.out.println(linha);

				String[] dados = linha.split("\\;");

				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setIdade(Integer.parseInt(dados[1]));

				pessoasList.add(pessoa);

			}
		}
		
		System.out.println(pessoasList);

	}

}
