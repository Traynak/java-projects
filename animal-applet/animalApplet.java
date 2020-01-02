//********************************************************************
// FarmAnimal.java Author: Trevor Raynak
//
// 
//********************************************************************

package Applet;

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class FarmAnimal extends JApplet {

	 

	public void init() {
		
	}
	
	public void paint (Graphics page)
	{
		final int MID = 150;
		final int TOP = 50;
		
		setBackground (Color.blue);//covers entire applet (sky)
		
		page.setColor (Color.green);
		page.fillRect (0, 180, 300, 50);//grass
		
		page.setColor (Color.yellow);
		page.fillOval (-50, -50, 90, 90);//sun base
		page.drawLine(5, 20, 15, 60);// sun streak 1
		page.drawLine(25, 25, 45, 45);//sun streak 2
		page.drawLine(20, 5, 60, 15);//sun streak 3
		
		page.setColor (Color.green);
		page.fillOval (MID-23, TOP-12, 50, 50);//head fill
		page.setColor(Color.black);
		page.drawArc(MID-23, TOP-12, 50, 50, -60, 300);//head outline
		
		page.setColor (Color.LIGHT_GRAY);
		page.fillOval (MID-33, TOP+32, 70, 82);//body
		page.setColor (Color.black);
		page.drawArc(MID-33, TOP+32, 70, 82, 105, 325);//body outline
			
		page.setColor (Color.orange);
		page.fillRect(MID-6, TOP+14, 18, 30);//beak fill 
		page.setColor(Color.black);
		page.drawRect(MID-6, TOP+14, 18, 30);//beak outline
		
		page.setColor(Color.green);
		page.fillArc(MID+16, TOP+45, 20, 55, 10, 360);//right wing fill
		page.setColor(Color.black);
		page.drawArc(MID+16, TOP+45, 20, 55, 10, 360);//right wing outline
		
		page.setColor(Color.green);
		page.fillArc(MID-33, TOP+45, 20, 55, 10, 360);//left wing fill
		page.setColor(Color.black);
		page.drawArc(MID-33, TOP+45, 20, 55, 90, 360);//left wing outline
		
		page.setColor (Color.white);
		page.fillOval (MID-13, TOP, 15, 20);
		page.fillOval (MID+3, TOP, 15, 20);//eyes fill
		page.setColor(Color.black);
		page.drawOval(MID-13, TOP, 15, 20);
		page.drawOval(MID+3, TOP, 15, 20);//eyes outline
		
		page.setColor(Color.black);
		page.fillOval(MID-6, TOP+6, 6, 6);
		page.fillOval(MID+6, TOP+6, 6, 6);//eye balls
		
		page.setColor(Color.orange);
		page.fillRect(MID-10, TOP+113, 15, 18);
		page.fillRect(MID+2, TOP+113, 15, 18);//feet fill
		page.setColor (Color.black);
		page.drawRect(MID-10, TOP+113, 13, 18);
		page.drawRect(MID+2, TOP+113, 13, 18);//feet outline
		
		page.setColor (Color.green);
		page.drawRect(250, 120, 8, 60);//flower stem
		page.fillRect(250, 120, 8, 60);
		
		page.setColor(Color.red);
		page.fillArc(210, 114, 40, 25, 0, 360);//left pedal fill
		page.setColor(Color.black);
		page.drawArc(210, 114, 40, 25, 0, 360);//left pedal outline
		
		page.setColor(Color.red);
		page.fillArc(260, 114, 40, 25, 0, 360);//right pedal fill
		page.setColor(Color.black);
		page.drawArc(260, 114, 40, 25, 0, 360);//right pedal outline
		
		page.setColor(Color.red);
		page.fillArc(244, 80, 25, 40, 0, 360);//top pedal fill
		page.setColor(Color.black);
		page.drawArc(244, 80, 25, 40, 0, 360);//top pedal outline
		
		page.setColor (Color.yellow);
		page.drawOval(245, 115, 20, 20);
		page.fillOval(245, 115, 20, 20);//flower center

	}
}
