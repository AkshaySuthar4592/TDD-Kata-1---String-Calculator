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
		else if(numbers.length()==1)
			return Integer.valueOf(numbers);
		else
		{
			String num[] = numbers.split(",");
			return sumOfNumbers(num[0],num[1]);
		}
	}
	
	public static int sumOfNumbers(String a,String b)
	{
		return Integer.valueOf(a)+Integer.valueOf(b);
	}
}
