package Ex7;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TripleFilled extends JFrame {
	public TripleFilled(JPanel panel) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,900);
		this.setLocation(100,100);
		this.add(panel);		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		TripleFilledPanel panel = new TripleFilledPanel(100, 100, 100, 100, Color.pink, 100, 100, 100, 100, Color.yellow, Color.black);
		new TripleFilled(panel);
	}
}
