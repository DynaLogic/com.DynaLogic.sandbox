package com.DynaLogic.sandbox;

public class API 
{
	static double var1 = 100.5;
	static double var2 = 100.5;

	
	public static boolean Test()
	{
		if (var1 == var2)
		{
			System.out.println("true");
			return true;
		}
		else
		{
			System.out.println("false");
			return false;
		}
		
		
	}
}
