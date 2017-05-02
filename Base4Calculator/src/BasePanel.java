import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;

/**
* This Class is used to create and populate the calculator with 
* buttons for user input. 
* 
* @author Aleksandr Kovalev
*/

public class BasePanel extends JPanel {
	
	/**
	   * These are the static buttons to be used by the program.
	   * Calc is the object created that will do all the calculations
	   * for the program.
	   */
	
	protected static BaseCalculatorModel calc; //this is the object that does the calculation
	static JButton zero, //the variables for the buttons
	one, 
	two, 
	three, 
	four,
	five,
	six,
	seven,
	eight,
	nine,
	ten,
	eleven,
	twelve,
	thirteen,
	fourteen,
	fifteen,
	plus, 
	minus, 
	multiply, 
	divide, 
	clear,
	equals;
	
	//The Panel Layout
	GridLayout buttonLayout = new GridLayout(5,5);
	
	//The defualt Constructor
	BasePanel() {
		this.setLayout(buttonLayout); 
		
		zero = new JButton("0"); 
		zero.addActionListener(new ZeroListener());
		
		one = new JButton("1");
		one.addActionListener(new OneListener());
		
		two = new JButton("2"); 
		two.addActionListener(new TwoListener());
		
		three = new JButton("3"); 
		three.addActionListener(new ThreeListener());
		
		four = new JButton("4"); 
		four.addActionListener(new FourListener());
		
		five = new JButton("5"); 
		five.addActionListener(new FiveListener());
		
		six = new JButton("6"); 
		six.addActionListener(new SixListener());
		
		seven = new JButton("7"); 
		seven.addActionListener(new SevenListener());
		
		eight = new JButton("8"); 
		eight.addActionListener(new EightListener());
		
		nine = new JButton("9"); 
		nine.addActionListener(new NineListener());
		
		ten = new JButton("A"); 
		ten.addActionListener(new TenListener());
		
		eleven = new JButton("B"); 
		eleven.addActionListener(new ElevenListener());
		
		twelve = new JButton("C"); 
		twelve.addActionListener(new TwelveListener());
		
		thirteen = new JButton("D"); 
		thirteen.addActionListener(new ThirteenListener());
		
		fourteen = new JButton("E"); 
		fourteen.addActionListener(new FourteenListener());
		
		fifteen = new JButton("F"); 
		fifteen.addActionListener(new FifteenListener());
		
		two = new JButton("2"); 
		two.addActionListener(new TwoListener());
		
		plus = new JButton("+");
		plus.addActionListener(new AddListener());
		
		minus = new JButton("-"); 
		minus.addActionListener(new SubListener());
		
		multiply = new JButton("x");
		multiply.addActionListener(new MultiplyListener());
		
		divide = new JButton("/"); 
		divide.addActionListener(new DivideListener());
		
		clear = new JButton("Clr");
		clear.addActionListener(new ClearListener());
		
		equals = new JButton("=");
		equals.addActionListener(new EqualsListener());	

		add(clear);
		add(plus);
		add(minus);
		add(multiply);
		add(divide);
		add(fifteen);
		add(fourteen);
		add(thirteen);
		add(twelve);
		add(eleven);
		add(ten);
		add(nine);
		add(eight);
		add(seven);
		add(six);
		add(five);
		add(four);
		add(three);
		add(two);
		add(one);
		add(zero);
		add(equals);
		
		//The button layout is set to 10, which is the default base on startup.
		ButtonLayout(10);
		calc = new BaseCalculatorModel();

	}
	
	/** This functions is used to alter the buttons of the calculator
	 * based on the current base the calculator is set on. Depending
	 * on the Base that is passed in the parameter, the buttons are 
	 * enabled or disabled. The buttons are disabled or enabled using 
	 * 'setEnabled' and a simply expressions that will be true or false 
	 * (i.e. Base >= 11, for Base 10). Each button will be checked.
	 * 
	 * @param Base Is an int that represents the number base.
	 */
	
	static void ButtonLayout(int Base){
		
		two.setEnabled(Base >= 3);
		three.setEnabled(Base >= 4);
		four.setEnabled(Base >= 5);
		five.setEnabled(Base >= 6);
		six.setEnabled(Base >= 7);
		seven.setEnabled(Base >= 8);
		eight.setEnabled(Base >= 9);
		nine.setEnabled(Base >= 10);
		ten.setEnabled(Base >= 11);
		eleven.setEnabled(Base >= 12);
		twelve.setEnabled(Base >= 13);
		thirteen.setEnabled(Base >= 14);
		fourteen.setEnabled(Base >= 15);
		fifteen.setEnabled(Base >= 16);
		
		return;
		
	}
	
	class ZeroListener implements ActionListener{
		
			public void actionPerformed(ActionEvent e) {
				
				calc.addInput("0");
				TextPanel.Display.setText(calc.currentInput());
				
			}
	}
	
	class OneListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("1");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class TwoListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("2");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class ThreeListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("3");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class FourListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("4");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class FiveListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("5");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class SixListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("6");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class SevenListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("7");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class EightListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("8");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class NineListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("9");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class TenListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("A");
			TextPanel.Display.setText(calc.currentInput());
		
		}
	}
	
	class ElevenListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("B");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class TwelveListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("C");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class ThirteenListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("D");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class FourteenListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("E");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class FifteenListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput("F");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class AddListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput(" + ");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	class SubListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput(" - ");
			TextPanel.Display.setText(calc.currentInput());
			
		}
	}
	
	//when equals is pressed the calculator calculates the number 
	//and returns the answer to the display.
	class EqualsListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.Calculate(calc.currentInput());
			TextPanel.Display.setText(calc.currentInput());
		
			
		}
	}
	
	class MultiplyListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput(" x ");
			TextPanel.Display.setText(calc.currentInput());
			
			
		}
	}
	
	class DivideListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.addInput(" / ");
			TextPanel.Display.setText(calc.currentInput());
			
			
		}
	}
	
	class ClearListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			calc.clear();
			TextPanel.Display.setText(calc.currentInput());
			
			
		}
	}
	

	// you need to deal with event handling. before you go too crazy writing code, 
	// think about when the calc object needs to be involved, and when it doesn't 

}
