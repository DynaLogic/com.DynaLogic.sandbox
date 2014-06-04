package site;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Addr extends Applet implements ActionListener{
	private static final long serialVersionUID = 1L;
	Label textOne = new Label("Type the Two numbers that you want to add");
	static Label outputField = new Label("Output goes here");
	TextField entryOne = new TextField("Type Number one here");
	TextField entryTwo = new TextField("Type Number two here");
	JButton buttonOne = new JButton("Calculate");
	Button cancelButton = new Button("Exit");
	
	
	
	

	public void init() {
		setForeground(Color.DARK_GRAY);
		setBackground(Color.orange);
		add(textOne);
		add(entryOne);
		add(entryTwo);
		add(buttonOne);
		add(cancelButton);
		buttonOne.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String userTyped = entryOne.getText();
				String userTwo = entryTwo.getText();
				testr(userTyped, userTwo);
			}

		});
		
		cancelButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		add(outputField);

	}
	
	public static void testr(String userTyped, String userTwo)
	{
		float userIn1 = Float.parseFloat(userTyped);
		float userIn2 = Float.parseFloat(userTwo);
		String userOut = String.valueOf(userIn1 + userIn2);
		outputField.setText(userOut);
		
	}
	

	@Override public void actionPerformed(ActionEvent e) {}
	}