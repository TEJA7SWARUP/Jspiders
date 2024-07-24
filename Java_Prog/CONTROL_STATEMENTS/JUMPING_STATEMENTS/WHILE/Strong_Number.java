import java.util.Scanner;
class Strong_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = se.nextInt();
		int temp =num;
		int sum = 0;
		while(temp != 0)
		{
			int prod = 1;
			int ld = temp%10;
			for (int i = 1;i<=ld ;i++ )
			{
				prod *= i;
			}
			sum += prod;
			temp = temp / 10;
		}
		if (sum == num)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a Strong number");
		}
	}
}
