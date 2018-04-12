import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		for (int i = 0; i < 450; i++) {
			String q = JOptionPane.showInputDialog("Give me a #.");
			int w = Integer.parseInt(q);
			for (int j = 2; j < w-1; j++) {

				if (w % j == 0) {
					JOptionPane.showMessageDialog(null, "Not Prime");
					System.exit(0);;
				}
			}
			
			
			JOptionPane.showMessageDialog(null, "It's Prime.");
				
			
		}

	}
}
