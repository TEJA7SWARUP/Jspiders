import java.util.Scanner;
class Sum_Of_Factorial_Value_Of_Number
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
				prod = prod*i;
			}
			sum  += prod;
			temp = temp / 10;
		}
		System.out.println("sum :"+sum);
	}
}
