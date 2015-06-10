import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NameFrame extends JFrame {

	private JButton okButton, cancelButton;
	private JLabel label;
	private JTextField textField;
	private String name = null;
		
	public NameFrame(String title)	{
		super(title);
		setLayout(new FlowLayout());
		label = new JLabel("Name");
		okButton = new JButton("OK");
		cancelButton = new JButton("Cancel");
		textField = new JTextField(15);
		add(label);
		add(textField);
		add(okButton);
		add(cancelButton);
		okButton.addActionListener(new Listener());
		cancelButton.addActionListener(new Listener());
		setSize(200, 100);
		setVisible(false);
	}
	
	public String getName()	{
		return this.name;
	}
	
	class Listener implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == okButton)	{
				name = textField.getText();
				setVisible(false);
			}
			if (e.getSource() == cancelButton)
				setVisible(false);			
		}
		
	}
}
