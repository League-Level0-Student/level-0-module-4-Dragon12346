//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	static int pet;
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happyness = 0;
	static int task;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		pet = JOptionPane.showOptionDialog(null, "What pet do you want?", "Pets", 0, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] { "Dog", "Cat", "Sloth" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int i = 0; i < 100; i++) {
			if (happyness > 100) {
				i = i + 10000;
			}
			task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Actions", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Groom1", "Take a walk2", "Feed3", "Water4" },
					null);
		}
		if (task == 1) {
			groom();
		}
		else if (task == 2) {
			take_a_walk();
		}
		else if (task == 3) {
			feed();
		}
		else if (task == 4) {
			Water();
		}
		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void groom() {
		happyness = happyness + 4;
		if (pet == 1) {
			JOptionPane.showMessageDialog(null, "Your Dog barks with exitement!");
		}
		if (pet == 2) {
			JOptionPane.showMessageDialog(null, "Your Cat purrs softly!");
		}
		if (pet == 3) {
			JOptionPane.showMessageDialog(null, "Your Sloth is barly moving with exitement!");
			System.out.println("hi");
		}
	}

	static void take_a_walk() {
		happyness = happyness + 5;
		if (pet == 1) {
			JOptionPane.showMessageDialog(null, "Your Dog barks with exitement!");
		}
		if (pet == 2) {
			JOptionPane.showMessageDialog(null, "Your Cat purrs softly!");
		}
		if (pet == 3) {
			JOptionPane.showMessageDialog(null, "Your Sloth is barly moving with exitement!");
		}
	}

	static void feed() {
		happyness = happyness + 3;
		if (pet == 1) {
			JOptionPane.showMessageDialog(null, "Your Dog barks with exitement!");
		}
		if (pet == 2) {
			JOptionPane.showMessageDialog(null, "Your Cat purrs softly!");
		}
		if (pet == 3) {
			JOptionPane.showMessageDialog(null, "Your Sloth is barly moving with exitement!");
		}
	}

	static void Water() {
		happyness = happyness + 3;
		if (pet == 1) {
			JOptionPane.showMessageDialog(null, "Your Dog barks with exitement!");
		}
		if (pet == 2) {
			JOptionPane.showMessageDialog(null, "Your Cat purrs softly!");
		}
		if (pet == 3) {
			JOptionPane.showMessageDialog(null, "Your Sloth is barly moving with exitement!");
		}
	}

}