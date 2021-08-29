import java.util.*;
import java.io.*;
import java.lang.*;

public class StringCalculator {
	static int count=0;
	public static void main(String args[])
	{
		
	}
	public static int Add(String numbers)
	{
		count++;
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
	
	public static int GetCalledCount()
	{
		return count;
	}
	public static int sumOfNumbers(String num[])
	{
		int total = 0;
		String negativeNum = "";
		for(String n : num)
		{
			if(Integer.valueOf(n)<0)
			{
				if(negativeNum.equals(""))
					negativeNum = n;
				else
					negativeNum += (","+n);
			}
			total+=Integer.valueOf(n);
		}
		if(!negativeNum.equals(""))
		{
			throw new IllegalArgumentException("Negatives not allowed: " + negativeNum);
		}
		return total;
	}
}
