import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Calculator extends JFrame {
	private JTextField calcDisplay;
	private JButton[] buttons;
	private JLabel statusMessage;
	private JPanel buttonPanel;
	private JPanel opButtonPanel;
	private JPanel fnButtonPanel;
	private JPanel numButtonPanel;
	private JPanel displayPanel;
	private JLabel emptyCell; 
	private static float total;
	private static float memory;
	private boolean newOp;
	private char lastOp;
	private float calcRegister; 
	
	public Calculator() {
		super("Gerry's Wonderful Calculator");
		total = 0;
		memory = 0;
		calcRegister = 0;
		newOp = false;
		lastOp = '=';
		emptyCell = new JLabel();
		statusMessage = new JLabel();
		statusMessage.setText(" ");
		addKeyListener(new ButtonListener());
		buttonPanel = new JPanel();
		numButtonPanel = new JPanel();
		opButtonPanel = new JPanel();
		fnButtonPanel = new JPanel();
		displayPanel = new JPanel();
		setLayout(new BorderLayout());
		buttonPanel.setLayout(new BorderLayout());
		numButtonPanel.setLayout(new GridLayout(4,3,2,2));
		fnButtonPanel.setLayout(new GridLayout(2,4,2,2));
		opButtonPanel.setLayout(new GridLayout(4,1,2,2));
		displayPanel.setLayout(new BorderLayout());
		calcDisplay = new JTextField(16);
		calcDisplay.addKeyListener(new ButtonListener());
		calcDisplay.setEditable(false);
		calcDisplay.setBackground(Color.BLACK);
		calcDisplay.setForeground(Color.GREEN);
		calcDisplay.setFont(new Font("Courier", Font.BOLD,42));
		calcDisplay.setHorizontalAlignment(JTextField.RIGHT);
		calcDisplay.setText("0");
		add(buttonPanel, BorderLayout.CENTER);
		add(statusMessage, BorderLayout.SOUTH);
		buttonPanel.add(numButtonPanel, BorderLayout.CENTER);
		buttonPanel.add(opButtonPanel, BorderLayout.EAST);
		buttonPanel.add(fnButtonPanel, BorderLayout.NORTH);		
		displayPanel.add(calcDisplay, BorderLayout.WEST);
		add(displayPanel, BorderLayout.NORTH);
		initButtons();
		displayButtons();
		calcDisplay.requestFocus();
		setSize(405, 450);
		setVisible(true);
	}

	private void displayButtons() 	{
		for (int i = 1; i < 10; ++i)	{
			numButtonPanel.add(buttons[i]);
			if (i == 9)
				numButtonPanel.add(emptyCell);
		}
		numButtonPanel.add(emptyCell);
		numButtonPanel.add(buttons[0]);
		opButtonPanel.add(buttons[10]);
		opButtonPanel.add(buttons[11]);
		opButtonPanel.add(buttons[12]);
		opButtonPanel.add(buttons[13]);
		numButtonPanel.add(emptyCell);
		numButtonPanel.add(emptyCell);
		numButtonPanel.add(buttons[14]);
		numButtonPanel.add(buttons[15]);
		fnButtonPanel.add(buttons[18]);
		fnButtonPanel.add(buttons[19]);
		fnButtonPanel.add(buttons[20]);
		fnButtonPanel.add(buttons[21]);
		fnButtonPanel.add(buttons[16]);
		fnButtonPanel.add(buttons[17]);
		fnButtonPanel.add(emptyCell);
	}
	
	private void initButtons()	{
		buttons = new JButton[22];
		for (int i = 0; i < 10; ++i)	{
			buttons[i] = new JButton(Integer.toString(i));
			buttons[i].addActionListener(new ClickListener());
		}
		buttons[10] = new JButton("+");
		buttons[10].addActionListener(new ClickListener());
		buttons[11] = new JButton("-");
		buttons[11].addActionListener(new ClickListener());
		buttons[12] = new JButton("/");
		buttons[12].addActionListener(new ClickListener());
		buttons[13] = new JButton("*");
		buttons[13].addActionListener(new ClickListener());
		buttons[14] = new JButton("=");
		buttons[14].addActionListener(new ClickListener());
		buttons[15] = new JButton(".");
		buttons[15].addActionListener(new ClickListener());
		buttons[16] = new JButton("C");
		buttons[16].addActionListener(new ClickListener());
		buttons[17] = new JButton("AC");
		buttons[17].addActionListener(new ClickListener());
		buttons[18] = new JButton("M+");
		buttons[18].addActionListener(new ClickListener());
		buttons[19] = new JButton("M-");
		buttons[19].addActionListener(new ClickListener());
		buttons[20] = new JButton("MC");
		buttons[20].addActionListener(new ClickListener());
		buttons[21] = new JButton("MR");
		buttons[21].addActionListener(new ClickListener());
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}

	class ClickListener implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < 16; ++i)	{
				if (e.getSource() == buttons[i])	{
					keyHandler(buttons[i].getText().charAt(0));
				}
			}
			if (e.getSource() == buttons[16])         // C		
				calcReset(false);
			if (e.getSource() == buttons[17])		  // AC
				calcReset(true);
			if (e.getSource() == buttons[18])         // M+
				memoryHandler(buttons[18].getText()); 
			if (e.getSource() == buttons[19])         // M-
				memoryHandler(buttons[19].getText()); 
			if (e.getSource() == buttons[20])         // MC
				memoryHandler(buttons[20].getText()); 
			if (e.getSource() == buttons[21])         // MR
				memoryHandler(buttons[21].getText()); 
			calcDisplay.requestFocus();
		}	
	}
	
	private void memoryHandler(String memOp)	{
		calcRegister = Float.parseFloat(calcDisplay.getText());
		switch (memOp)	{
		case "M+":
			if (calcRegister != 0)	{
				memory += calcRegister;
				statusMessage.setText("M");
				newOp = true;
				calcRegister = 0;
			}
			break;
		case "M-":
			if (calcRegister != 0)	{
				memory -= calcRegister;
				statusMessage.setText("M");
				newOp = true;
				calcRegister = 0;
			}
			break;
		case "MC":
			memory = 0;
			statusMessage.setText(" ");
			newOp = true;
			break;
		case "MR":
			if ((int)memory ==  memory)
				calcDisplay.setText(Integer.toString((int)memory));				
			else
				calcDisplay.setText(Float.toString(memory));
			newOp = true;
			statusMessage.setText(" ");
			memory = 0;
			break;		
		}
	}
	
	class ButtonListener implements KeyListener	{

		@Override
		public void keyTyped(KeyEvent e) {
			String validKeys = "01234567890+-/*=.";
			if (validKeys.indexOf(e.getKeyChar()) != -1)	
				keyHandler(e.getKeyChar());
		}		

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == 27)	
				calcReset(true);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private void calcReset(Boolean full)	{
		if (full)
			total = 0;
		calcDisplay.setText("0");
		lastOp = '=';
	}
	
	private void keyHandler(char key) 	{
		switch (key)	{
		case '.':
			if (newOp)
				displayHandler("" + key, true);
			else if (calcDisplay.getText().indexOf(".") == -1)
				displayHandler("" + key, false);
			newOp = false;
			break;
		case  '0':
			try {
				if (newOp)
					displayHandler("" + key, true);
				else if (calcDisplay.getText().indexOf(".") != -1)
					displayHandler("" + key, false);
				else if (Float.parseFloat(calcDisplay.getText()) != 0)	
					displayHandler("" + key, false);
				newOp = false;
			} catch (CalculatorDisplayException e)	{
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				calcReset(true);
				calcRegister = 0;				
			}
			break;
		case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
			try {
				if ((Float.parseFloat(calcDisplay.getText()) == 0 && calcDisplay.getText().indexOf(".") == -1) || newOp)
					displayHandler("" + key, true);
				else
					displayHandler("" + key, false);
				newOp = false;
			} catch (CalculatorDisplayException e)	{
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				calcReset(true);
				calcRegister = 0;				
			}
			break;
		case '+': case '-': case '/': case '*': case '=':
			try	{
				if (total == 0)	{
					calcRegister = Float.parseFloat(calcDisplay.getText());
					total = calcRegister;
				} else	{
					calcRegister = Float.parseFloat(calcDisplay.getText());
					try	{
						total = doOperation(lastOp, calcRegister, total);
					} catch (CalculatorDivideByZeroException e)	{
						JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
						calcReset(true);
						calcRegister = 0;
					}
				}
				lastOp = key;
				if ((int)total ==  total)
					displayHandler(Integer.toString((int)total), true);
				else
					displayHandler(Float.toString(total), true);
				newOp = true;
			} catch (CalculatorDisplayException e)	{
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				calcReset(true);
				calcRegister = 0;
			}
			break;
		}
	}
	
	private void displayHandler(String text, Boolean fresh) throws CalculatorDisplayException	{
		if (calcDisplay.getText().length() >= 14)
			throw new CalculatorDisplayException("Overflow - number too large");
		if (fresh)
			calcDisplay.setText(text);		
		else
			calcDisplay.setText(calcDisplay.getText() + text);
	}
	
	private float doOperation(char op, float value1, float value2) throws CalculatorDivideByZeroException	{
		float opTotal = 0;
		if (op == '/' && value1 == 0)
			throw new CalculatorDisplayException("Divide by zero");
		switch (op)		{
			case '+':
				opTotal = value2 + value1;
				break;
			case '-':
				opTotal = value2 - value1;
				break;
			case '/':
				opTotal = value2 / value1;
				break;
			case '*':
				opTotal = value2 * value1;
				break;
			case '=':
				opTotal = value2;
				break;
		}
		return opTotal;
	}
}
