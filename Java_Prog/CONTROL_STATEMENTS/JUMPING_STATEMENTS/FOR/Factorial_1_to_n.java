import java.util.Scanner;
class Factorial_1_to_n
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter last digit to print : ");
		int num = se.nextInt();
		int prod = 1;
		for (int i = 1;i<=num ; i++)
		{
			prod = prod*i;
		}
		System.out.println(prod);
	}
}
