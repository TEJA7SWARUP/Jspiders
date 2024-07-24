import java.util.Scanner;
class Prod_Of_odd_And_Sum_Of_even_Digits_in_number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = se.nextInt();
		int temp =num;
		int prod = 1;
		int sum = 0;
		while(temp != 0)
		{
			int ld = temp%10;
			if(ld%2 == 0)
			{
				sum += ld;
			}
			else
			{
				prod = prod*ld;
			}
			temp = temp / 10;
		}
		System.out.println("sum : "+sum);
		System.out.println("prouct : "+prod);
	}
}
