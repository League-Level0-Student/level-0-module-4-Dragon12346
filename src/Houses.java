import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		int e = new Random().nextInt(255);
		int w = new Random().nextInt(255);
		int q = new Random().nextInt(255);
		Robot r = new Robot();
		r.penDown();
		r.hide();
		r.setSpeed(100);
		r.setX(60);
		r.setWindowColor(Color.BLACK);
		r.setPenWidth(3);
		for (int i = 0; i < 19; i++) {
			int t = new Random().nextInt(5);
			r.setPenColor(e, w, q);
			if (t == 0) {
				drawq(r);
			}
			if (t == 1) {
				draww(r);
			}
			if (t == 2) {
				drawe(r);
			}
			if (t == 3) {
				drawr(r);
			}
			if (t == 4) {
				drawt(r);
			}

		}
	}

	static void drawq(Robot r) {
		r.setRandomPenColor();
		r.move(100);
		r.turn(90);
		r.move(20);
		r.turn(90);
		r.move(100);
		r.turn(270);
		r.setPenColor(Color.GREEN);
		r.move(20);
		r.turn(270);
	}
	
	
	static void draww(Robot r) {
		r.setRandomPenColor();
		r.move(100);
		r.turn(45);
		r.move(10);
		r.turn(90);
		r.move(10);
		r.turn(45);
		r.move(100);
		r.turn(270);
		r.setPenColor(Color.GREEN);
		r.move(20);
		r.turn(270);
	}
	
	
	static void drawe(Robot r) {
		r.setRandomPenColor();
		r.move(100);
		r.turn(90);
		r.move(20);
		r.turn(90);
		r.move(100);
		r.turn(270);
		r.setPenColor(Color.GREEN);
		r.move(20);
		r.turn(270);
	}
	
	
	static void drawr(Robot r) {
		r.setRandomPenColor();
		r.move(100);
		r.turn(90);
		r.move(20);
		r.turn(90);
		r.move(100);
		r.turn(270);
		r.setPenColor(Color.GREEN);
		r.move(20);
		r.turn(270);
	}
	
	
	static void drawt(Robot r) {
		r.setRandomPenColor();
		r.move(100);
		r.turn(90);
		r.move(20);
		r.turn(90);
		r.move(100);
		r.turn(270);
		r.setPenColor(Color.GREEN);
		r.move(20);
		r.turn(270);
	}

}
