import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;




public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        
		
        int count1 = 0;
        while (count1 < 27) {
        	g2.drawLine(650-count1*25, 0, 0, count1*25);
        	count1++;
        }
        
        int count2 = 0;
        while (count2 < 27) {
        	g2.drawLine(0, count2*25, count2*25, 650);
        	count2++;
        }

        for (int count3=0; count3<27; count3++) {
        	g2.drawLine(999, 650-count3*25, 1000-count3*25, 0);
        }
        
        for (int count4=0; count4<27; count4++) {
        	g2.drawLine(999, 25*count4, 1000-count4*25, 650);
        }
	}
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1010,690);
		f.add(this);
		f.setVisible(true);
		
	}
}

//public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	//public void paint(Graphics g) {
		
		//Graphics2D g2 = (Graphics2D) g;
        //g2.setStroke(new BasicStroke(5));
        
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		//g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		//g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		//g2.drawLine(765/2, 10, 765/2,550 );
		
		
		//4) small rectangles on top-left
		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		// lines 
		//int count1 = 0;
		//while(count1 < 100) {
			
			//int x1 = (int)(Math.random()*((370+1))+10);
			//int y1 = (int)(Math.random()*((250+1))+15);
			//int x2 = (int)(Math.random()*((370+1))+10);
			//int y2 = (int)(Math.random()*((250+1))+15);
			//g2.setStroke(new BasicStroke (1));
			//g2.setColor(new Color((int)(Math.random()*(255+1))+0, (int)(Math.random()*(255+1))+0, (int)(Math.random()*(255+1))+0));
			//g2.drawLine(x1, y1, x2, y2);
			//count1++;
		//}
		
		// squares
		//int count2 = 0;
		//while(count2 < 50) {
			//int xSquare = (int)(Math.random()*((345+1))+380);
			//int ySquare = (int)(Math.random()*((180+1))+15);
			//g2.setColor(new Color((int)(Math.random()*(255+1))+0, (int)(Math.random()*(255+1))+0, (int)(Math.random()*(255+1))+0));
			//g2.fillRect(xSquare, ySquare, 50, 50);
			//count2++;
		//}
		
		// circles
		//int count3 = 0;
		//while(count3 <100) {
			//int diameter = (int)(Math.random()*((130+1))+20);
			//int xCircle = (int)(Math.random()*((220+1))+15);
			//int yCircle = (int)(Math.random()*((130+1))+270);
			//g2.setColor(new Color((int)(Math.random()*(255+1))+0, (int)(Math.random()*(255+1))+0, (int)(Math.random()*(255+1))+0));
			//g2.drawOval(xCircle, yCircle, diameter, diameter);
			//count3++;
		//}
		
		// cube
		//g2.setColor(Color.yellow);
		//g2.fillRect(500, 350, 100, 100);
		//
		//g2.setColor(Color.red);
		//g2.fillRect(550,  400,  100, 100);
		
		//g2.setColor(Color.blue);
		//int [] bluex= {600, 600, 650};
		//int [] bluey = {350, 400, 400};
		//int bluePoints = 3;
		//g2.fillPolygon(bluex, bluey, bluePoints);
		
		//g2.setColor(Color.green);
		//int [] greenx = {500, 500, 550, 550};
		//int [] greeny = {350, 450, 500, 400};
		//int greenpoints = 4;
		//g2.fillPolygon(greenx, greeny, greenpoints);
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	//}
	
	
	
	
	
	
	
	
	
	//public static void main(String[] arg) {
	//	Runner m = new Runner();
	//}
	
	//public Runner() {
	//	JFrame f = new JFrame("Method Use");
	//	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	f.setSize(800,600);
	//	f.add(this);
	//	f.setVisible(true);
		
	//}
//}
