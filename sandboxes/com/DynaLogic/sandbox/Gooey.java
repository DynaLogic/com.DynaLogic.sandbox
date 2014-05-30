package com.DynaLogic.sandbox;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Gooey extends Applet implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8258034080855520305L;


	Label partJuan = new Label("I am TEXT");
	Button buttonJuan = new Button("I AM A BUTTON");
	TextField inputJuan = new TextField("I AM A TEXT FIELD");
	
	
	public void init()
	{
		setForeground(Color.DARK_GRAY);
		setBackground(Color.orange);
		add(partJuan);
		add(buttonJuan);
		add(inputJuan);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}
