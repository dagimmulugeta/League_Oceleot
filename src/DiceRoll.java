import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DiceRoll{
	JFrame window = new JFrame("Roll the Dice!");
	JPanel panel = new JPanel();
	JButton rollButton = new JButton("CLICK HERE TO ROLL");
	JLabel label = new JLabel();
	
	BufferedImage oneImg;
	BufferedImage twoImg;
	BufferedImage threeImg;
	BufferedImage fourImg;
	BufferedImage fiveImg;
	BufferedImage sixImg;
	
	public void run(){
		try {
			oneImg = ImageIO.read(new URL("https://github.com/DaveDLeague/DiceRoll/blob/master/src/one_dice.jpeg?raw=true"));
			twoImg = ImageIO.read(new URL("https://github.com/DaveDLeague/DiceRoll/blob/master/src/two_dice.jpeg?raw=true"));
			threeImg = ImageIO.read(new URL("https://github.com/DaveDLeague/DiceRoll/blob/master/src/three_dice.jpeg?raw=true"));
			fourImg = ImageIO.read(new URL("https://github.com/DaveDLeague/DiceRoll/blob/master/src/four_dice.jpeg?raw=true"));
			fiveImg = ImageIO.read(new URL("https://github.com/DaveDLeague/DiceRoll/blob/master/src/five_dice.jpeg?raw=true"));
			sixImg = ImageIO.read(new URL("https://github.com/DaveDLeague/DiceRoll/blob/master/src/six_dice.jpeg?raw=true"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		label.setIcon(new ImageIcon(oneImg));
		
		rollButton.addActionListener((e)->{
			Random dagi = new Random();
			
			int randomChoice = dagi.nextInt(6);
			
			
			if(randomChoice == 0){
				label.setIcon(new ImageIcon(oneImg));
			}else if(randomChoice == 2){
				label.setIcon(new ImageIcon(twoImg));
			}else if(randomChoice == 4){
				label.setIcon(new ImageIcon(threeImg));
			}
			else if(randomChoice == 3){
				label.setIcon(new ImageIcon(fourImg));
			}
			else if(randomChoice == 1){
				label.setIcon(new ImageIcon(fiveImg));
			}
			else{
				label.setIcon(new ImageIcon(sixImg));
			}
		});
		
		panel.setPreferredSize(new Dimension(700, 700));
		panel.add(rollButton);
		panel.add(label);
		window.add(panel);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}
	
	public static void main(String[] args) {
		new DiceRoll().run();
	}
}