package site;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Display extends Applet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("THIS IS THE TEXT", 200, 70);
		g.drawString("This is placed at 0" ,  0,  0);
		setBackground(Color.gray);

	}

}
