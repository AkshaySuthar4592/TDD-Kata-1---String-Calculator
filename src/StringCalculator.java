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
			String delimiter = ",|\n";
			if(numbers.matches("//(.*)\n(.*)"))
			{
				int indexOfNewLine = numbers.indexOf("\n");
				delimiter = numbers.substring(2, indexOfNewLine);
				numbers = numbers.substring(indexOfNewLine+1);
			}
			
			String num[] = numbers.split("["+delimiter+ "]+");
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
			if(Integer.valueOf(n)<=1000)
				total+=Integer.valueOf(n);
			
		}
		if(!negativeNum.equals(""))
		{
			throw new IllegalArgumentException("Negatives not allowed: " + negativeNum);
		}
		return total;
	}
}
