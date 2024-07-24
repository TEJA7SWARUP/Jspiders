import java.util.Scanner;
class Prime_number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = se.nextInt();
		boolean isprime= true;
		for (int i = 2;i< num;i++ )
		{
			if (num%i == 0)
			{
				isprime= false;
			}
		}
		if (isprime == true)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not A Prime number");
		}
	}
}
