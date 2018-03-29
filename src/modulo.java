import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class modulo {
	Robot r = new Robot();
	int w = new Random().nextInt(255);
	void go() {
	r.penDown();
	r.setPenWidth(3);
	r.setX(200);
	r.setY(300);	
	r.hide();
	r.setSpeed(100);

	for (int i = 0; i < 72; i++) {

		if (i%6==0) {	
			r.setRandomPenColor();
			
		}
		drawShape(3);
		r.move(20);
		r.turn(5);

	}
	}

void drawShape(int numSides) {
	for (int i = 0; i < numSides; i++) {

		r.turn(360/numSides);
		r.move(100);
		

	}
		
			

	
	// 4. Write a for loop that will draw a shape with 'numSides' sides
	//    Hint: turn 360/numSides
}

public static void main(String[] args) {

	new modulo().go();
}
}

