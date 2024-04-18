package cursojava.threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.SimpleAttributeSet;

public class TelaTimeThread extends JDialog{
	
	private JPanel jpanel = new JPanel(new GridBagLayout()); /*Painel de componentes */
	
	private JLabel descricaoHora = new JLabel("Time thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) { /* Fica sempre rodando */
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
	};
	
private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) { /* Fica sempre rodando */
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	
 public TelaTimeThread() { /* executa o que tiver dentro no momento da aertura ou execução */
	
	 setTitle("Tela de time com thread");
	 setSize(new Dimension(240,240));
	 setLocationRelativeTo(null);
	 setResizable(false);
	 // Primeira fase concluida
	 
	 GridBagConstraints gridBagContraints = new GridBagConstraints();
	 gridBagContraints.gridx = 0;
	 gridBagContraints.gridy = 0;
	 gridBagContraints.gridwidth = 2;
	 gridBagContraints.anchor = GridBagConstraints.WEST;
	 gridBagContraints.insets = new Insets(5, 10, 5, 5);
	 
	 descricaoHora.setPreferredSize(new Dimension(200,25));
	 jpanel.add(descricaoHora, gridBagContraints);
	 
	 mostraTempo.setPreferredSize(new Dimension(200,25));
	 gridBagContraints.gridy ++;
	 mostraTempo.setEditable(false);
	 jpanel.add(mostraTempo, gridBagContraints);
	 
	 descricaoHora2.setPreferredSize(new Dimension(200,25));
	 gridBagContraints.gridy ++;
	 jpanel.add(descricaoHora2, gridBagContraints);
	 
	 mostraTempo2.setPreferredSize(new Dimension(200,25));
	 gridBagContraints.gridy++;
	 mostraTempo2.setEditable(false);
	 jpanel.add(mostraTempo2, gridBagContraints);
	 
	 gridBagContraints.gridwidth = 1;
	 
	 /*************************************************************************************/
	 
	 jButton.setPreferredSize(new Dimension(92,25));
	 gridBagContraints.gridy++;
	 jpanel.add(jButton, gridBagContraints);
	 
	 jButton2.setPreferredSize(new Dimension(92,25));
	 gridBagContraints.gridx++;
	 jpanel.add(jButton2, gridBagContraints);
	 
	 
	 
	 jButton.addActionListener(new ActionListener() { 
		
		@Override
		public void actionPerformed(ActionEvent e) { /* Executa o clique no botão */
			
			thread1Time = new Thread(thread1);
			thread1Time.start();
			
			thread2Time = new Thread(thread2);
			thread2Time.start();
			
			jButton.setEnabled(false);
			jButton2.setEnabled(true);
			
		}
	});
	 
	 jButton2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			thread1Time.stop();
			thread2Time.stop();
			
			jButton.setEnabled(true);
			jButton2.setEnabled(false);
		}
	});
	 
	 jButton2.setEnabled(false);
	 add(jpanel, BorderLayout.WEST);
	 
	 setVisible(true);/* Torna a tela visivel para o usuário */
	 }
	
}
