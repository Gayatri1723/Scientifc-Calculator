package Scientific_Cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;

public class ScientificCalculator {

	private JFrame frmCalculatorgayatri;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmCalculatorgayatri.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatorgayatri = new JFrame();
		frmCalculatorgayatri.setTitle("Calculator (Gayatri -07)");
		frmCalculatorgayatri.setBounds(100, 100, 485, 361);
		frmCalculatorgayatri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmCalculatorgayatri.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Option");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Basic");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmCalculatorgayatri.setTitle("Basic Calculator (Gayatri -07)");
				frmCalculatorgayatri.setBounds(100, 100, 309, 367);
				txtDisplay.setBounds(10, 11, 280, 46);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmCalculatorgayatri.setTitle("Scientific Calculator (Gayatri -07)");
				frmCalculatorgayatri.setBounds(100, 100, 520, 367);
				txtDisplay.setBounds(10, 11, 490, 46);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		frmCalculatorgayatri.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(26, 10, 239, 49);
		frmCalculatorgayatri.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("Backspace");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace = null;
				if (txtDisplay.getText().length()> 0) {
					StringBuilder strB=new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace= strB.toString();
					txtDisplay.setText(backspace);
				}
			}
			
		});
		btnNewButton.setBounds(10, 71, 104, 35);
		frmCalculatorgayatri.getContentPane().add(btnNewButton);
		
		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(null);
			}
		});
		btn_C.setBounds(124, 69, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn_C);
		
		JButton btnPlusminus = new JButton("\u00B1");
		btnPlusminus.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPlusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusminus.setBounds(182, 69, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btnPlusminus);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSqrt.setBounds(238, 69, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btnSqrt);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="/";
			}
		});
		btnDiv.setBounds(182, 116, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btnDiv);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setBounds(124, 116, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn9);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(iNum);
			}
			
		});
		btn7.setBounds(10, 116, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setBounds(67, 116, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn8);
		
		JButton btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="%";
			}
		});
		btnper.setBounds(238, 116, 47, 84);
		frmCalculatorgayatri.getContentPane().add(btnper);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setBounds(10, 163, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setBounds(67, 163, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setBounds(124, 163, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="*";
			}
			
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMul.setBounds(182, 163, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btnMul);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn1.setBounds(10, 210, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setBounds(67, 210, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setBounds(124, 210, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btn3);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnsub.setBounds(182, 210, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btnsub);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				secondnum=Double.parseDouble(txtDisplay.getText());
				if(operation == "+") 
				{
					result= firstnum + secondnum;
					answer= String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operation == "-") 
				{
					result= firstnum - secondnum;
					answer= String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operation == "*") 
				{
					result= firstnum * secondnum;
					answer= String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operation == "/") 
				{
					result= firstnum / secondnum;
					answer= String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEqual.setBounds(238, 210, 47, 84);
		frmCalculatorgayatri.getContentPane().add(btnEqual);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn0.setBounds(10, 257, 104, 37);
		frmCalculatorgayatri.getContentPane().add(btn0);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btnDecimal.getText();
				txtDisplay.setText(iNum);
			}
		});
		btnDecimal.setBounds(124, 257, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btnDecimal);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="+";
				
			}
		});
		btnadd.setBounds(182, 257, 47, 37);
		frmCalculatorgayatri.getContentPane().add(btnadd);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setBounds(311, 69, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCos.setBounds(311, 116, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTan.setBounds(311, 163, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnTan);
		
		JButton btnPi = new JButton("\u03C0");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops;
				ops= (3.1415926535897932384626433832795);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPi.setBounds(311, 210, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnPi);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="Mod";
				
			}
		});
		btnMod.setBounds(311, 257, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnMod);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="Exp";
				
			}
		});
		btnExp.setBounds(394, 69, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnExp);
		
		JButton btnPower = new JButton("x^y");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.pow(ops, ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnPower.setBounds(394, 116, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnPower);
		
		JButton btnSq = new JButton("x^2");
		btnSq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=(ops * ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnSq.setBounds(394, 163, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnSq);
		
		JButton btnFact = new JButton("log10");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnFact.setBounds(394, 210, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnFact);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setBounds(394, 257, 65, 37);
		frmCalculatorgayatri.getContentPane().add(btnLog);
	}
}
