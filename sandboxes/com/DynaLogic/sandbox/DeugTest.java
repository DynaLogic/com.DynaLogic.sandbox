package com.DynaLogic.sandbox;

import java.io.*;

public class DeugTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		while (true)
		{
			System.out.print("Input: ");
			BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
			String input = dataIn.readLine();
			if (input =="ping")
			{
				System.out.println("Pong");
			}
			else
			{
				System.out.println("NO");
				System.out.println(input);
			}
			Thread.sleep(1000);
		}

	}

}
