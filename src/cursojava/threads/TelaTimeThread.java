package cursojava.threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{
	
	private JPanel jpanel = new JPanel(new GridBagLayout()); /*Painel de componentes */
	
	private JLabel descricaoHora = new JLabel("Time thread 1");
	private JTextField mostraTempo = new JTextField();
	private JTextField mostraTempo2 = new JTextField();
	private JLabel descricaoHora2 = new JLabel("Time thread");
	
 public TelaTimeThread() { /* executa o que tiver dentro no momento da aertura ou execução */
	
	 setTitle("Tela de time com thread");
	 setSize(new Dimension(240,240));
	 setLocationRelativeTo(null);
	 setResizable(false);
	 // Primeira fase concluida
	 
	 GridBagConstraints gridBagContraints = new GridBagConstraints();
	 gridBagContraints.gridx = 0;
	 gridBagContraints.gridy = 0;
	 
	 descricaoHora.setPreferredSize(new Dimension(200 , 25));
	 jpanel.add(descricaoHora, gridBagContraints);
	 
	 mostraTempo.setPreferredSize(new Dimension(200,25));
	 gridBagContraints.gridy ++;
	 jpanel.add(mostraTempo, gridBagContraints);
	 
	 descricaoHora2.setPreferredSize(new Dimension(200,25));
	 gridBagContraints.gridy ++;
	 jpanel.add(descricaoHora2, gridBagContraints);
	 
	 mostraTempo2.setPreferredSize(new Dimension(200,25));
	 gridBagContraints.gridy++;
	 jpanel.add(mostraTempo2, gridBagContraints);
	 
	 add(jpanel, BorderLayout.WEST);
	 
	 setVisible(true);/* Torna a tela visivel para o usuário */
	 }
	
}
