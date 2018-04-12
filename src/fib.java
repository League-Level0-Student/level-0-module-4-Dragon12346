import javax.swing.JOptionPane;

public class fib {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 11; i++) {
			c = a + b;
			System.out.println(a + b);
			a = b;
			b = c;


		}
	}
}
