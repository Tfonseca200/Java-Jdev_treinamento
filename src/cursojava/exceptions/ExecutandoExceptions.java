package cursojava.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import javax.swing.JOptionPane;


public class ExecutandoExceptions  {

	public static void main(String[] args) throws ExecaoPersonalizada{
		
		
		try {
			
			
		Double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		
		JOptionPane.showMessageDialog(null, numero);
		
		List<String> nomes = new ArrayList<String>();
		
		String nome = JOptionPane.showInputDialog("Digite seu nome completo");
		nomes.add(nome);
		
		for(String nomeList : nomes){
			JOptionPane.showMessageDialog(null, "nome cadastrado: " + nomeList);
		}
		
		
		}catch(NumberFormatException e){
			
			JOptionPane.showMessageDialog(null, "Erro ao inserir numero");
			e.printStackTrace();
			
			StringBuilder saida = new StringBuilder();
			
		 for(int pos = 0; pos < e.getStackTrace().length; pos ++) {	
			saida.append("\nClasse do erro: " + e.getStackTrace()[pos].getClassName());
			saida.append("\nMétodo do erro: " + e.getStackTrace()[pos].getMethodName());
			saida.append("\nLinha do erro: " + e.getStackTrace()[pos].getLineNumber());
		} 
		 
		 JOptionPane.showMessageDialog(null, saida.toString());
		
		}catch(NullPointerException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "opaa, Null pointer estourou");
			
		}catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		finally {
			JOptionPane.showMessageDialog(null, "finalizado");
		}
	}
	
	
	public static void lerArquivo()throws ExecaoPersonalizada {
		try {
			File file = new File("arquivo.txt");
			Scanner scanner = new Scanner(file);
		}catch (FileNotFoundException e) {
			throw new ExecaoPersonalizada(e.getMessage());
		}
		
		
		
	}

}
