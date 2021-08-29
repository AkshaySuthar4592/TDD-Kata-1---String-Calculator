import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

public class TestCalculator {
	
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("TestCalculator");
	}
	StringCalculator calculator = new StringCalculator();
	@BeforeClass
	public static void add1MethodCount()
	{
		System.out.println("Add() method invoke time is : "+StringCalculator.GetCalledCount());
	}
	@Test
	public void emptyString()
	{
		assertEquals(0,calculator.Add(""));
	}
	@Test
	public void oneNumber()
	{
		assertEquals(1,calculator.Add("1"));
	}
	@Test
	public void twoNumber()
	{
		assertEquals(3,calculator.Add("1,2"));
	}
	@Test
	public void unknownNumber()
	{
		assertEquals(15,calculator.Add("1,2,3,4,5"));
	}
	@Test
	public void newLine()
	{
		assertEquals(6,calculator.Add("1\n2,3"));
	}
	@Test
	public void otherdelimiter()
	{
		assertEquals(3,calculator.Add("//;\n1;2"));
	}
	@Test
	public void testNegativeNumber()
	{
		try
		{
			calculator.Add("1,-2");
		}
		catch(IllegalArgumentException E)
		{
			assertEquals(E.getMessage(), "Negatives not allowed: -2");
		}
		try
		{
			calculator.Add("1,-2,3,4,-5,-6");
		}
		catch(IllegalArgumentException E)
		{
			assertEquals(E.getMessage(), "Negatives not allowed: -2,-5,-6");
		}
	}
	
	@AfterClass
	public static void addMethodCount()
	{
		System.out.println("Add() method invoke time is : "+StringCalculator.GetCalledCount());
	}
	@Test
	public void testNumberBiggerThanThousand()
	{
		assertEquals(2,calculator.Add("2,1001"));
	}
	@Test
	public void testOtherDelimiter()
	{
		assertEquals(6,calculator.Add("//[***]\n1***2***3"));
	}
	@Test
	public void testMultipleDelimiter()
	{
		assertEquals(6,calculator.Add("//[*][%]\n1*2%3"));
	}
}
