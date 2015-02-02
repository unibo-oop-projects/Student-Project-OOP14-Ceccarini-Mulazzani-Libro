package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import utilities.GUIUtilities;

/**
 * 
 * @author Alberto Mulazzani
 *
 */


public class MagazGUI {

	private final JButton[] buttons = new JButton[5];
	private final String[] names = {"Aggiungi un libro", "Rimuovi un libro", "Modifica un libro", "Ricerca un libro", "Lista dei libri"};
	private final JPanel jf = new JPanel();
	
	public MagazGUI(){	

		jf.setLayout(new BorderLayout());
	    final Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	    final int x = (dim.width )/4;
	    final int y = (dim.height)/3;
	    jf.setSize(x, y);
	    jf.setLocation(x, y);
		
		
		final JPanel main = new JPanel();
		main.setLayout(new GridBagLayout());
		GridBagConstraints c = GUIUtilities.getConstr();
		
		for (int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton(names[i]);
			buttons[i].setPreferredSize(new Dimension(150,25));
			main.add(buttons[i], c);
			c.gridy++;
			
		}		
		
		final JPanel comandi = new JPanel(new FlowLayout());
		comandi.add(main);
		main.setBorder(new TitledBorder("Gestione Magazzino"));
		final JPanel main2 = new JPanel(new FlowLayout());
		main2.add(GUIUtilities.getClosing());
		
		jf.add(comandi, BorderLayout.CENTER);
		jf.add(main2, BorderLayout.SOUTH);
		
	}
	
	
	public JPanel getPane(){
		return this.jf;
	}
	
}
