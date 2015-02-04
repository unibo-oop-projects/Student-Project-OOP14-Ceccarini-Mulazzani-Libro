package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import utilities.ControllerUtilities.TipoController;
import utilities.GUIUtilities;
import controller.BookController;

/**
 * 
 * @author Alberto Mulazzani
 *
 */


public class MagazGUI {

	private final JButton[] buttons = new JButton[5];
	private final String[] names = {"Aggiungi un libro", "Vendi un libro", "Modifica un libro", "Ricerca un libro", "Lista dei libri"};
	private final JPanel jf = new JPanel();
	
	public MagazGUI(BookController controller, TipoController type){	
		
	
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
		
		
		buttons[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showOptionDialog(jf, new AddBookGUI(controller, type).getPane() , "Aggiungi un libro", JOptionPane.DEFAULT_OPTION, 
	                     JOptionPane.INFORMATION_MESSAGE, null, GUIUtilities.string, null);
			
			}
		});
		
		buttons[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showOptionDialog(jf, new SearchBookGUI(controller, type).getPane() , "Vendi un libro", JOptionPane.DEFAULT_OPTION, 
	                     JOptionPane.INFORMATION_MESSAGE, null, GUIUtilities.string, null);
			
			}
		});
		
		buttons[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				JOptionPane.showOptionDialog(jf, new SearchBookGUI(controller, type).getPane() , "Modifica un libro", JOptionPane.DEFAULT_OPTION, 
	                     JOptionPane.INFORMATION_MESSAGE, null, GUIUtilities.string, null);
			
			}
		});
		
		
		
		buttons[3].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				JOptionPane.showOptionDialog(jf, new SearchBookGUI(controller, type).getPane() , "Cerca un libro", JOptionPane.DEFAULT_OPTION, 
	                     JOptionPane.INFORMATION_MESSAGE, null, GUIUtilities.string, null);
			
			}
		});
		
		buttons[4].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				JOptionPane.showOptionDialog(jf, new ListTableGUI(controller, type).getPane() , "Lista dei libri", JOptionPane.DEFAULT_OPTION, 
	                     JOptionPane.INFORMATION_MESSAGE, null, GUIUtilities.string, null);
			
			}
		});
		
	}
	
	
	public JPanel getPane(){
		return this.jf;
	}
	
}
