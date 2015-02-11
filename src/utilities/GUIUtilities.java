package utilities;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @author Alberto Mulazzani
 *
 */
public class GUIUtilities {

	public final static String[] string = {"Annulla"};
	
	public static GridBagConstraints getConstr(){
		final GridBagConstraints c = new GridBagConstraints();
		c.gridy = 0;
		c.insets = new Insets(3,3,7,3);
		c.fill = GridBagConstraints.HORIZONTAL;
		
		return c;
	}
	
	public static JButton getClosing(){
		final JButton chiudi = new JButton("Salva e Chiudi");
		chiudi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					SaveClass.saveAll();
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		return chiudi;	
		
	}
	
	
	public static JButton getReset(final JTextField[] fields){
		final JButton reset = new JButton("Reset");
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < fields.length; i++){
					fields[i].setText("");
				}
			}
		});
		
		return reset;
	}
	
	public static ImageIcon icon = createImageIcon("/iconBook.png");
	
	private static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = GUIUtilities.class.getResource(path);

		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find image file: " + path);
			return null;
		}
	}
	
	public static JPanel wrapperPanel(final JComponent component, final int orientation){
		final JPanel panel = new JPanel(new FlowLayout(orientation));
		panel.add(component);
		return panel;
	}
	
	
}
