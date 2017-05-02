
import java.util.regex.Pattern;

/** This Class will do all the math for the calculator program.
 * Once the calculations are done it will return the result to 
 * display.
 * 
 * @author Aleksandr Kovalev
 *
 */

public class BaseCalculatorModel{
	
	/**
	 * int value of current calculation.
	 */
	
	private int value;
	
	/**
	 * the current input in the display, also used as if it is the display text.
	 * the display always asks for this value.
	 */
	
	private String input; 
	
	/**
	 * the base that the calculator is currently on
	 */
	
	int Base;
	
	/** Default Constructor that sets up the calculator for use.
	 * The Base is also set to 10, by default.
	 * 
	 */
	BaseCalculatorModel(){ value = 0; input = ""; Base = 10; }
	
	/** Function that clears the input(Display) and resets the variables
	 */
	
	void clear() { value = 0; input = ""; }
	
	//accessors
	int currentValue() { return value; }
	void setValue(int x) { value = x; }
	String currentInput() {return input; }
	
	/** This function adds a String onto the input(Display)
	 * 
	 * @param s the string to be added.
	 */
	void addInput(String s){ input += s; }
	
	/** This function sets a new value for input(Display). It takes in a number and
	 * converts it into a string in the current base of the calculator.
	 * 
	 * @param x the number to be converted into a string
	 */
	
	void setNewInput(int x) { 
		input = "";
		input = Integer.toString(x, Base);}
	
	/** This function takes in a String, reads it, and converts the numbers 
	 * into the current base, and then places them back into the string. This
	 * string will then be place into the input(Display) variable.
	 * 
	 * 
	 * @param toConvert the string to be converted into the new base.
	 * @param fromBase the original base.
	 * @param toBase the new base to be converted into.
	 */
	
	void convBase(String toConvert, int fromBase, int toBase) {
		
		//check if the string is empty or invalid, and exit if it is.
		if(toConvert == "" || toConvert == null || toConvert == "Error"){
			input = "Error"; //sends an error message to the display.
			return;
		}
		
		String temp = "";
		
		//splits up the display into an array, using the spaces as the separator.
		String[] arrInput = toConvert.split(" ");
		
		for(int index = 0; index < arrInput.length; index++){
			
		//based on the pattern of an math expression. 
		//First comes the number, then the operation, and then a number again.
		//i.e 2 + 2 
		if(index % 2 == 0){
			//converts the number to new base.
			arrInput[index] = Integer.toString(Integer.parseInt(arrInput[index], fromBase), toBase);
			temp += arrInput[index];
			}
		else{	
			//adds the operator onto the string, which is not converted
			temp = temp + " " + arrInput[index] + " ";
			}
		
			}
		
		input = temp.trim(); //trims and passes the string back into input after converted.
		
		return;
	    
	}
	
	
	/**This function is the traffic cop that directs the program on which operation to use,
	 * based on the the current math expression sent to it. The function then calls 
	 * one of the operations functions in this class, to find the value of the expression.
	 * 
	 * @param expression A String that contains a math expression.
	 */
	
	void Calculate(String expression){
		
		//goes through the expression and determines the operation function to run.
		for(int index = 1; index < expression.length(); index++){
			
			switch (expression.charAt(index)){
				case '+': addition(expression);
							break;
				case '-': subtraction(expression);
							break;
				case 'x': multiple(expression);
							break;
				case '/': divide(expression);
							break;
							
				default: break;
					
			}
			
		}
				
	return;
		
		//I plan to make this function more advanced. 
		//My goal is to make it read a math expression and solve it
		//Using operation order (i.e. (3 + 4) - 10 / 5 = )
		
	}
	
	
	/** This Function adds two numbers, from the expression sent. 
	 * Then returns them to the input, which will be displayed as
	 * the answer on the calculator display.
	 * 
	 * @param exp A String with a math expression. 
	 */
	
	void addition(String exp){

		String[] arrNums = exp.split(Pattern.quote(" + "));
		
		setValue(Integer.parseInt(arrNums[0], Base) + Integer.parseInt(arrNums[1], Base));
		setNewInput(currentValue());
		
		return;
	}
	
	/** This Function subtracts two numbers, from the expression sent.
	 * Then returns them to the input, which will be displayed as
	 * the answer on the calculator display.
	 * 
	 * @param exp A String with a math expression.
	 */
	
	void subtraction(String exp){
		
		String[] arrNums = exp.split(Pattern.quote(" - "));
		
		setValue(Integer.parseInt(arrNums[0], Base) - Integer.parseInt(arrNums[1], Base));
		setNewInput(currentValue());
		
		return;
		
	}
	
	/** This Function multiples two numbers, from the expression sent.
	 * Then returns them to the input, which will be displayed as
	 * the answer on the calculator display.
	 * 
	 * @param exp A String with a math expression.
	 */
	
	void multiple(String exp){
		
		String[] arrNums = exp.split(Pattern.quote(" x "));
		
		setValue(Integer.parseInt(arrNums[0], Base) * Integer.parseInt(arrNums[1], Base));
		setNewInput(currentValue());
		
		return;
		}
	
	/** This Function multiples two numbers, from the expression sent.
	 * Then returns them to the input, which will be displayed as
	 * the answer on the calculator display.
	 * 
	 * @param exp A String with a math expression.
	 */
	
	void divide(String exp){
		
		String[] arrNums = exp.split(Pattern.quote(" / "));
		
		setValue(Integer.parseInt(arrNums[0], Base) / Integer.parseInt(arrNums[1], Base));
		setNewInput(currentValue());
		
		return;
		
	}
	
}
