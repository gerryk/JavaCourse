import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class HelloFrame extends JFrame {
	private JButton hello, goodbye, nameButton;
	private JLabel label;
	private JPanel centrePanel;
	private JOptionPane namePanel;
	private String name = null;
	
	public HelloFrame(String title)	{
		super(title);
		setLayout(new BorderLayout());
		label = new JLabel("Label");
		add(label, BorderLayout.SOUTH);
		centrePanel = new JPanel();
		add(centrePanel, BorderLayout.CENTER);
		centrePanel.setLayout(new FlowLayout());
		namePanel = new JOptionPane();
		hello = new JButton("Hello");
		goodbye = new JButton("Goodbye");
		nameButton = new JButton("Name");
		centrePanel.add(hello);
		centrePanel.add(goodbye);
		centrePanel.add(nameButton);
		hello.addActionListener(new Listener());
		goodbye.addActionListener(new Listener());
		nameButton.addActionListener(new NameButtonListener());
		setSize(200, 200);
		setVisible(true);
	}
	
	class Listener implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == hello)	
				if (name != null) 
					label.setText("Hello " + name);
				else
					label.setText("Hello");
			if (e.getSource() == goodbye)
				if (name != null) 
					label.setText("Goodbye " + name);
				else
					label.setText("Goodbye");

		}
	}
	
	class NameButtonListener implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == nameButton)
				name = (String)namePanel.showInputDialog(null, "Please enter your name:", "Name", JOptionPane.PLAIN_MESSAGE);
		}
		
	}
	
	public static void main(String[] args) {
		HelloFrame f = new HelloFrame("Hello");
	}

}
