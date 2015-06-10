import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HelloFrame extends JFrame {
	private JButton hello, goodbye, nameButton;
	private JLabel label;
	private JPanel centrePanel;
	private NameFrame n;
	
	public HelloFrame(String title)	{
		super(title);
		n = new NameFrame("Name");
		setLayout(new BorderLayout());
		label = new JLabel("Label");
		add(label, BorderLayout.SOUTH);
		centrePanel = new JPanel();
		add(centrePanel, BorderLayout.CENTER);
		centrePanel.setLayout(new FlowLayout());
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
				if (n.getName() != null) 
					label.setText("Hello " + n.getName());
				else
					label.setText("Hello");
			if (e.getSource() == goodbye)
				if (n.getName() != null) 
					label.setText("Goodbye " + n.getName());
				else
					label.setText("Goodbye");

		}
	}
	
	class NameButtonListener implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == nameButton)
				n.setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {
		HelloFrame f = new HelloFrame("Hello");
	}

}
