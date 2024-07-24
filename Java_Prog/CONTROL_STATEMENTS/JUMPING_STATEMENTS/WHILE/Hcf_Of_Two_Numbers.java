import java.util.Scanner;
class Hcf_Of_Two_Numbers
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
		
		System.out.println(divisor);
	}
}
