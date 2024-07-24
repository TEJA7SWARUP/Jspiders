import java.util.Scanner;
class Lcm_Of_Two_Numbers
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int n1 = se.nextInt();
		System.out.println("Enter number2 : ");
		int n2 = se.nextInt();
		int i = 1;
		while (true)
		{
			if ((i*n1)/n2 == 0)
			{
				System.out.println("Lcm is : "+(n1*i));
				break;
			}
			i++;
		}
		
	}
}
