import java.util.Scanner;
class Even_Or_Odd
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = se.nextInt();
		if (num%2 == 0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}
