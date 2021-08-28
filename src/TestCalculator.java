import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("TestCalculator");
	}
	StringCalculator calculator = new StringCalculator();
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
}
