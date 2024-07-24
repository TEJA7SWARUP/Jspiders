import java.util.Scanner;
class Proper_Factors_sum
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = se.nextInt();
		int sum=0;
		for (int i = 1;i<num ; i++)
		{
			if(num%i == 0)
			{
				sum = sum+i;
			}
		}
		System.out.println(sum);
		
	}
}
