package site;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Display extends Applet implements ActionListener{
	static Float errLvl;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label textOne = new Label("This is a thing indeed");
	Label outputField = new Label("Output goes here");
	TextField entryOne = new TextField("Type Stuff here");
	JButton buttonOne = new JButton("Calculate");
	Button cancelButton = new Button("Exit");
	
	
	
	

	public void init() {
		setForeground(Color.DARK_GRAY);
		setBackground(Color.orange);
		add(textOne);
		add(entryOne);
		add(buttonOne);
		add(cancelButton);
		buttonOne.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String userTyped = entryOne.getText();
				testr(userTyped);
			}

		});
		
		cancelButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		add(outputField);

	}

	
	private void testr(String userTyped) {
		errLvl = 0f;
		if (userTyped.equals("Ping")) outputField.setText("Pong");
		else errLvl = errLvl + 1f;
		
		if (userTyped.equals("ping")) outputField.setText("Pong");
		else errLvl = errLvl + 1f;
		
		if (userTyped.equals("Pong")) outputField.setText("Ping");
		else errLvl = errLvl + 1f;
		
		if (userTyped.equals("pong")) outputField.setText("Ping");
		else errLvl = errLvl + 1;
		
		if (errLvl >= 4) outputField.setText("No Custom Results Found, You typed " + userTyped + ".");
		
	}


	@Override public void actionPerformed(ActionEvent e){}

}
