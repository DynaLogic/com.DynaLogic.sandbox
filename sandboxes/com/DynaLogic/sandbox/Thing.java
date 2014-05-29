package com.DynaLogic.sandbox;

import java.io.*;


public class Thing {

	public static void main(String[] args) throws InterruptedException, IOException{
		while (true)
		{
			System.out.print("Input: ");
			BufferedReader getInput = new BufferedReader(new InputStreamReader(System.in));
			String Input = getInput.readLine();
			if (Input.equals("Ping"))
			{
				System.out.println("Pong");
			}
			else
			{
				if (Input.equals("Pong"))
				{
					Return("Ping");
				}
				else
				{
					if (Input.equals("ping"))
					{
						Return("Pong");
					}
					else
					{
						if (Input.equals("pong"))
						{
							Return("ping");
						}
						else
						{
							Return("Not Ping or Pong");
						}
					}
				}
			}
			if (Input.equals("password"))
			{
				System.out.print("Input: ");
				Thread.sleep(5000);
				Return("");
				System.out.print("What is the password?");
				BufferedReader pswInput = new BufferedReader(new InputStreamReader(System.in));
				String Password = pswInput.readLine();
				if (Password.equals("WordPass"))
				{
					Return("WELCOME");
				}
				else
				{
					Return("INCORECT");				}
			}
			Thread.sleep(500);
		}

	}
	public static void Return(String in)
	{
		System.out.println(in);
	}

}
