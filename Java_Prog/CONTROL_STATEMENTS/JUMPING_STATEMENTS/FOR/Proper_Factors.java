import java.util.Scanner;
class Proper_Factors
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = se.nextInt();
		for (int i = 1;i<num ; i++)
		{
			if(num%i == 0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
}
