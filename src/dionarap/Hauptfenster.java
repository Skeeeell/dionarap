package dionarap;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;

public class Hauptfenster extends JFrame {

	private static final long serialVersionUID = 1L;
	private static String titel = "Dionarap";
	private Spielfeld spielfeld;
	
	
	
	public Hauptfenster(Point position, String level) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	
	this.setTitle(titel);
	this.setResizable(false);
	this.setLayout(new BorderLayout());
	this.setLocation(position);
	
	
	this.setVisible(true);
	
	
	}

	public static void main(String[] args) {
		
	}
}
