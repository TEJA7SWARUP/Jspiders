import java.util.Scanner;
class Co_Primes_Or_Not
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int divisor = se.nextInt();
		System.out.println("Enter number2 : ");
		int dividend = se.nextInt();
		while (dividend != 0)
		{
			int rem = dividend%divisor;
			divisor = dividend;
			dividend = rem;
		}
		
		if (divisor == 1)
		{
			System.out.println("Co-primes");
		}
		else
		{
			System.out.println("Non-Co-primes");
		}
	}
}
