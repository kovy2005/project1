import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**This Class is the Base Number Slider for the calculator. It creates
 * a JSlider that the user can use to change the Base of the Calculator.
 * Adjusting the JSlider will; change the base of the number displayed 
 * in the text field, and change the calculations into the new base.
 * 
 * @author Aleksandr Kovalev
 *
 */

public class BaseSlider extends JPanel{

	static JSlider baseSlider;
	JLabel label;
	FlowLayout sliderLayout = new FlowLayout();
	
	BaseSlider(){
		
		this.setLayout(sliderLayout);
		label = new JLabel("The Number Base");
		
		//settings for the slider
		baseSlider = new JSlider(2,16,10);
		baseSlider.setMajorTickSpacing(2);
		baseSlider.setMinorTickSpacing(1);
		baseSlider.setPaintTicks(true);
		baseSlider.setPaintLabels(true);
		baseSlider.addChangeListener(new SliderListener());
		
		add(label);
		add(baseSlider);
		
	}
	
	/** This is the Jslider action listener, that activates when
	 * user moves the Slider. This Class is used to change the number
	 * base of the calculator. When a new base is set, this class will:
	 * <p>
	 * - Convert the current number or expression in the text display.
	 * <br>
	 * - Change the Base value in the BaseCalculatorModel class, for 
	 * future calculations.
	 * <br>
	 * - Enable and Disable the buttons for the current number base.
	 * 
	 * 
	 * @author alexk
	 *
	 */
	
	class SliderListener implements ChangeListener {
		
	    public void stateChanged(ChangeEvent e) {
	    	
	        JSlider position = (JSlider)e.getSource(); //position of the slider
	        
	        // if the slider stopped moving, activate.
	        if (!position.getValueIsAdjusting()) {
	        	
	            int newBase = (int)position.getValue(); //position of the slider
	            BasePanel.ButtonLayout(newBase);
	            BasePanel.calc.convBase(BasePanel.calc.currentInput(), BasePanel.calc.Base, newBase);
	            BasePanel.calc.Base = newBase;
	            TextPanel.Display.setText(BasePanel.calc.currentInput());	                
	            
	        }
	    }
	}
	
}
