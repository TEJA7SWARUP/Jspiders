import java.util.Scanner;
class Perfect_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = se.nextInt();
		int sum=0;
		for (int i = 1;i<num ; i++)
		{
			if(num%i == 0)
			{
				sum = sum+i;
			}
		}
		if(sum == num)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not A Perfect Number");
		}
		
	}
}
