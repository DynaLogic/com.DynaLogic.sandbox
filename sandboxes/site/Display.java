package site;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Display extends Applet implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label textOne = new Label("THis is a thing indeed");
	Label outputField = new Label("Output goes here");
	Button buttonOne = new Button("Button Text");
	TextField entryOne = new TextField("TYpe shit here");
	
	
	
	

	public void init() {
		setForeground(Color.DARK_GRAY);
		setBackground(Color.orange);
		add(textOne);
		add(entryOne);
		add(buttonOne);
		buttonOne.addActionListener(this);
		add(outputField);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String userTyped = entryOne.getText();
		outputField.setText(userTyped);
		// TODO Auto-generated method stub
		
	}

}
