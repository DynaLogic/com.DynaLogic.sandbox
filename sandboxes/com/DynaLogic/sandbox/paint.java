package com.DynaLogic.sandbox;

import java.awt.Graphics;
import java.util.Date;

public class paint {
	public void paint(Graphics g)
	{
		Date currentDate = new Date();
		g.drawString("This is a test", 200, 70);
		g.drawString("This is line two",200,100);
		g.drawString(currentDate.toString(), 200, 130);
	}

}
