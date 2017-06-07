import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
import java.util.Random;
public class RobotHouses {
	public static void main(String[] args) {
		Robot dagi =new Robot(60,550);
		Random sup = new Random();
		int lol;
		
		
		for (int i = 0; i < 10; i++) {
			
		lol =sup.nextInt(401)+100;
		dagi.penDown();
		dagi.setPenColor(0, 0, 0);
		dagi.setSpeed(10);
		dagi.move(lol);
		dagi.turn(45);
	    dagi.move(25);
		dagi.turn(90);
		dagi.move(25);
		dagi.turn(45);
		dagi.move(lol);
		dagi.turn(-90);
		dagi.setPenColor(0, 255, 0);
		dagi.move(25);
		dagi.turn(-90);
		
		
		
		
		}
		
		
		
		
		
		
	}
}
