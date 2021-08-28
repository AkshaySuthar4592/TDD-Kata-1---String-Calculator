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
}
