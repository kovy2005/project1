import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

/** This Class is the display panel for the calculator. Which
 * is a text field that is not editable. The only way to edit the
 * display is to use the buttons provided in the calculator. The Display
 * uses a String called 'input', which is created through the users input and using
 * buttons on the calculator. The variable 'input' can be viewed as
 * a display variable.
 * 
 * @author Aleksandr Kovalev
 *
 */

public class TextPanel extends JPanel {
	
	static JTextField Display;
	
	/** This is a Constructor that sets up the calculator
	 * display panel.
	 */
	
	TextPanel(){
		
		//font settings for the display
		Font font = new Font("Arial", Font.BOLD,16);
		
		Display = new JTextField(30);
		Display.setFont(font);
		Display.setEditable(false);
		
		add(Display);
		
	}
	
}
