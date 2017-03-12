import java.awt.Color;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

public class GamePanel extends JPanel{
	//Variables about the Panel's dimensions
	public final int WIDTH = 500;
	public final int HEIGHT = 500;
	//Variables about the timer (cTime is in 'ticks')
	public final int DELAY = 20;
	private Timer timer;
	private double cTime = 0;
	private long ticks = 0;
	/* Setting up the Protagonist
	 * Protagonist( <X COORDINATE> , <Y COORDINATE> , <RADIUS> );
	 */
	private Protagonist pro = new Protagonist( (WIDTH/2), (HEIGHT/2), 5);
	
	
	public GamePanel(){
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		
		//Setting up the timer
		timer = new Timer(DELAY, new TimerListener());
		timer.start();
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		/*Code for drawing the background				aka layer 1
		*/
		
		//Code for drawing the main character/enemies	aka layer 2
		page.setColor(Color.cyan);
		page.fillOval( (int)pro.getMapX(), (int)pro.getMapY(),
				pro.getRadius()*2, pro.getRadius()*2);
		
		//Code for drawing the user interface			aka layer 3
		page.setColor(Color.white);
		//Displays current time in < Seconds > . < centi-seconds >
		page.drawString("HEALTH (pro): " + pro.getCurrentHealth() +"/"+ pro.getMaxHealth(),
				20, 40);
		page.drawString("TIME: " + cTime , 20, 20);
		
	}
	
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			//Updates the current time
			cTime += .02;
			ticks+=1;
			pro.setMapX(pro.getMapX() + .2);
			pro.setMapY(pro.getMapY() + .03);
			//Based on the fact that DELAY is 1/50th of a second
			//and this occurs every 15 seconds (50*15) = 750
			if( ticks%750 == 0 )
				pro.setCurrentHealth(-1);
			repaint();
		}
		
	}
}
