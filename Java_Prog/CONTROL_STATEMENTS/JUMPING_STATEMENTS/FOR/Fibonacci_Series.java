import java.util.Scanner;
class Fibonacci_Series
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter how many numbers you want : ");
		int n = se.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 1;i<=n ;i++ )
		{
			System.out.print(sum + " ");
			a=b;
			b=sum;
			sum=a+b;
		}
		System.out.println("");
	}
}
