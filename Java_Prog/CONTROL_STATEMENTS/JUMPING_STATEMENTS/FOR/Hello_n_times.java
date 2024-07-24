import java.util.Scanner;
class Hello_n_times
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter n value  to print : ");
		int n = se.nextInt();
		for (int i = 1;i<=n ;i++ )
		{
			System.out.println("Hello");
		}
	}
}
