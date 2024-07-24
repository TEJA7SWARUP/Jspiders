import java.util.Scanner;
class Duck_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = se.nextInt();
		int prod = 1;
		while (num != 0)
		{
			int ld = num%10;
			prod *= ld;
			num /= 10;
		}
		if(prod == 0)
		{
			System.out.println("Duck number");
		}
		else
		{
			System.out.println("Not a Duck number");
		}
	}
}
