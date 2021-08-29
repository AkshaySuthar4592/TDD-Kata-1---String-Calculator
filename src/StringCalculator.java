import java.util.*;
import java.io.*;
import java.lang.*;

public class StringCalculator {
	
	public static void main(String args[])
	{
		
	}
	public static int Add(String numbers)
	{
		if(numbers.isEmpty())
			return 0;
		else
		{
			String delimiter = ",";
			if(numbers.matches("//(.*)\n(.*)"))
			{
				delimiter=Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
			}
			
			String num[] = numbers.split(delimiter+"|\n");
			return sumOfNumbers(num);
		}
	}
	
	public static int sumOfNumbers(String num[])
	{
		int total = 0;
		for(String n : num)
			total+=Integer.valueOf(n);
		return total;
	}
}
