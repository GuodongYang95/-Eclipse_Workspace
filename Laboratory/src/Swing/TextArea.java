package Swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TextArea extends JFrame implements ActionListener{
	private JTextArea textArea;
	private JTextField textField; 
	private JButton addButton, clearButton;
	
	public TextArea() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,400);
		textArea = new JTextArea(30,100);//rows and columns
		this.add(textArea, BorderLayout.CENTER);
		textArea.setEnabled(false);
		
		JPanel bottomPanel = new JPanel();
		textField = new JTextField(10);
		bottomPanel.add(textField);
		addButton = new JButton("ADD");
		addButton.addActionListener(this);
		clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
		bottomPanel.add(addButton);
		bottomPanel.add(clearButton);
		this.add(bottomPanel, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			textArea.append(textField.getText() + "\n");
			textField.setText(""); // remove the text from the field
		}else if (e.getSource() == clearButton) {
			textArea.setText("");
		}
		
		}
	public static void main(String[] args) {
		new TextArea();
		
	}
	
}
