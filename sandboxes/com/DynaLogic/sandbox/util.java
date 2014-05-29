package com.DynaLogic.sandbox;

import java.util.Date;
import java.awt.*;
import java.applet.*;

@SuppressWarnings("unused")
public class util
{
	String inone;
	static Date currentDate = new Date();
	public static String print()
	{
		System.out.println("\tTHIS\tIS\tA\tTEST\t");
		return currentDate.toString();
	}
	
	public static boolean paintr()
	{
		//paint()
		return true;
	}
	
	public static String lel(String inone) 
	{
		System.out.print(inone);
		return inone;
		
	}
	
	public static String time()
	{
		Date currentDate = new Date();
		return currentDate.toString();
	}

}
