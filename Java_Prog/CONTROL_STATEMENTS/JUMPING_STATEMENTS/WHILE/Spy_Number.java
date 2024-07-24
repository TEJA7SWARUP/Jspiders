import java.util.Scanner;
class Spy_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = se.nextInt();
		int sum = 0;
		int prod = 1;
		while (num != 0)
		{
			int ld = num%10;
			sum += ld;
			prod *= ld;
			num /= 10;
		}
		if(prod == sum)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not A Spy number");
		}
	}
}
