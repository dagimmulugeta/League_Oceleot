import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot play = new Robot("batman");
		// 5. Set your robot's pen to the down position
play.penDown();
		// 3. Set the robot to go at max speed (10)
		play.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
		//for (int aj = 0; aj < 80.; aj++) {
		for (int aj = 100; aj > 0.; aj--) {
			// 7. Change the pen color to random
play.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
play.move(1*aj);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			play.turn(360/20);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)

			// 9. Set the pen width to i
			play.setPenWidth(aj);
play.moveTo(300,180);
play.hide();

		}
	}
}
