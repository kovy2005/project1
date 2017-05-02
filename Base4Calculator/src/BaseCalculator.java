import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
* The Base Calculator is a calculator program that runs in a window,
* which allows the user to make simple calculations using different 
* number Bases. This program allows the user to change the Number 
* Base of the calculator, to perform operations. The number bases for
* this calculator is 2-16.
* 
*
* @author  Aleksandr Kovalev
* @version 1.0
* @since   5-01-2017
*/

public class BaseCalculator {

	public static void main(String[] args) {
		createAndShowGUI();
	}

	/** This function creates the calculator GUI, and begins
	 * the calculator program for the user.
	 */
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Base Calculator");
		
		//adds all the panels to the window.
		frame.add(new TextPanel(), BorderLayout.NORTH);
		frame.add(new BaseSlider(), BorderLayout.SOUTH);
		frame.add(new BasePanel(), BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setVisible(true);
		
	}
	
}
