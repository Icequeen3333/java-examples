import java.math.BigInteger;

public class Factorial
{
	public static void main(String[] args)
	{	final int NUM_FACTS = 100;
		for(int i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! is " + factorial(i));
	}
	
	public static BigInteger factorial(int n)
	{	BigInteger result = BigInteger.ONE;
		for(int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
		return result;
	}
}