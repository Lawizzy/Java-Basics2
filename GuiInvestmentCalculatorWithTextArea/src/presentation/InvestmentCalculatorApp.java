package presentation;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import java.util.Currency;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import business.FinancialCalculations;
import business.Validation;

public class InvestmentCalculatorApp extends JFrame{
	
	//As going to manipulate the user input
	private JTextField investmentField;
	private JTextField rateField;
	private JTextField yearsField;
	private JTextArea totalField;

	
	public InvestmentCalculatorApp() {
		
		initComponents();
	}
	
	private void initComponents() {
		
		/**
		 * Makes the frame match the platform/OS in which is been run
		 */
		
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		/**
		 * JFrame attributes
		 */
		setTitle("Investment Calculator");
		setSize(750, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocationByPlatform(true);
		//setLocation(200, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setVisible(true);
		
		/**
		 * JPanel attributes
		 */
		JPanel buttonPanel = new JPanel();
		//buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints bagConst = new GridBagConstraints();
		add(panel);
		add(buttonPanel, BorderLayout.SOUTH);
		
		bagConst.anchor = GridBagConstraints.LINE_START;
		bagConst.insets = new Insets(5, 5, 0, 5);
		
		/**
		 * JLabel and JTextField attributes
		 */
		bagConst.gridx = 0;
		bagConst.gridy = 0;
		JLabel investmentLabel = new JLabel("Monthly Invenstment:");
		panel.add(investmentLabel, bagConst);
		
		bagConst.gridx = 1;
		bagConst.gridy = 0;
		investmentField = new JTextField(10);
		panel.add(investmentField, bagConst);
		
		//Shorthand
		bagConst.gridx = 0;
		bagConst.gridy = 1;
		panel.add(new JLabel("Interest Rate:"), bagConst);
		
		bagConst.gridx = 1;
		bagConst.gridy = 1;
		rateField = new JTextField(10);
		panel.add(rateField, bagConst);

		bagConst.gridx = 0;
		bagConst.gridy = 2;
		panel.add(new JLabel("Number of Years:"), bagConst);
		
		bagConst.gridx = 1;
		bagConst.gridy = 2;
		yearsField = new JTextField(10);
		panel.add(yearsField, bagConst);
		
		bagConst.gridx = 0;
		bagConst.gridy = 3;
		panel.add(new JLabel("Investment total:"), bagConst);
		
		bagConst.gridx = 1;
		bagConst.gridy = 3;
		totalField = new JTextArea(10, 20);
		JScrollPane scroll = new JScrollPane(totalField);
		totalField.setEditable(false);
		totalField.setText("Future Investment");
		panel.add(scroll, bagConst);
		
//		JLabel errorLabel = new JLabel();
//		errorLabel.setText("Blag blah blah");
//		panel.add(errorLabel);
		
		/**
		 * Button attributes
		 */
//		bagConst.gridx = 0;
//		bagConst.gridy = 4;
		JButton calculateButton = new JButton("Calculate");
		buttonPanel.add(calculateButton);

//		bagConst.gridx = 2;
//		bagConst.gridy = 4;
		JButton exitButton = new JButton("Exit");
		buttonPanel.add(exitButton);
		
		
		/**
		 * Button attributes for handling events/actions done by the button
		 * using lambda expression
		 */
		exitButton.addActionListener(action -> {
			System.exit(0);
			//System.exit(ABORT);
		});
		
		calculateButton.addActionListener(action -> calculateMethod());
		
	}

	private void calculateMethod() {
		
		Validation validation = new Validation();
		
		String msgEmpty = "";
		
		msgEmpty += validation.isPresent(investmentField.getText(), "Investment Field");
		msgEmpty += validation.isPresent(rateField.getText(), "Interest Rate");
		msgEmpty += validation.isPresent(yearsField.getText(), "Number of Years");

		
		if(!msgEmpty.isBlank()) {
			
			//String msg = "Monthly Investemest is required!!\nPlease fill the field";
			String title = "Invalid Entry";
			
			JOptionPane.showMessageDialog(null, msgEmpty, title, JOptionPane.WARNING_MESSAGE);
			
			//Prevents the method from executing 
			investmentField.requestFocusInWindow();
			return;
		}
		
		String msgInvalid = "";
		
		msgInvalid += validation.isDouble(investmentField.getText(), "Investment Field");
		msgInvalid += validation.isDouble(rateField.getText(), "Interest Rate");
		msgInvalid += validation.isInteger(yearsField.getText(), "Number of Years");

		
		if (!msgInvalid.isBlank()){
			
				
				String title = "Invalid Entry";
				
				JOptionPane.showMessageDialog(null, msgInvalid, title, JOptionPane.ERROR_MESSAGE);
				
				//Prevents the method from executing 
				investmentField.requestFocusInWindow();
				return;	

		}
		
		double investment = Double.parseDouble(investmentField.getText());
		double rate = Double.parseDouble(rateField.getText());
		int years = Integer.parseInt(yearsField.getText());
			
		FinancialCalculations.calculateFutureValue2(investment, rate, years);
			
		totalField.setText(FinancialCalculations.calculateFutureValue2(investment, rate, years));
	}

	public static void main(String[] args) {

		/**
		 * Launcher
		 */
//		java.awt.EventQueue.invokeLater(new Runnable() {
//
//			@Override
//			public void run() {
//
//				JFrame frame = new InvestmentCalculatorApp();
//			}
//			
//		});
		
		/**
		 * Or use a lambda expression
		 */
		
		java.awt.EventQueue.invokeLater(() -> {
			
			JFrame frame = new InvestmentCalculatorApp();
			//frame.setLayout(new  FlowLayout(FlowLayout.LEFT));
		});	
		
	}

}
