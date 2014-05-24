package com.DynaLogic.time;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

@SuppressWarnings("serial")
public class Gui extends Applet{
	
	public void paint(Graphics g) {
		g.drawString("Test thing\nand stuff and things", 0, 15);
		Date currentTime = new Date();
		g.drawString(currentTime.toString(), 200, 100);
		System.out.println(currentTime);
}
}