

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int i = 0; i < 1000; i++) {

		String t = JOptionPane.showInputDialog("What is the first num. in the problem?");
		int first = Integer.parseInt(t);
		String o = JOptionPane.showInputDialog("What is the second num. in the problem?");
		int second = Integer.parseInt(o);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What type of problem?", "Caulculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Addition", "Subtration", "Multiplacation", "Division" },
				null);
		 if (operation == 0) {
			addi(first, second);
		}
		 else if (operation == 1) {
			 subtract(first,second);
		}	
		 else if (operation == 2) {
			 multiply(first,second);
		}
		 else if (operation == 3) {
			 divide(first,second);
		}
		}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void addi(int first, int second) {
		int y = first + second;
		JOptionPane.showMessageDialog(null, "" + y);
	}
	static void subtract(int first, int second) {
		int u = first - second;
		JOptionPane.showMessageDialog(null, "" + u);	
	}
	static void multiply(int first, int second) {
		int i = first * second;
		JOptionPane.showMessageDialog(null, "" + i);
	}
	static void divide(int first, int second) {
		int o = first / second;
		JOptionPane.showMessageDialog(null, "" + o);
	}
	
	// 4. Create similar methods for subtraction, multiplication and division.
}