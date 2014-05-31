package com.DynaLogic.time;

import java.io.IOException;
import java.util.Date;

public class thing {
	static float runTime;

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		while (true)
		{
			if (runTime == 99) continue;
			Date currentDate = new Date();
			System.out.println(currentDate.toString());
			Thread.sleep(1000);
			runTime = runTime + 1f;
		}
	}
}
