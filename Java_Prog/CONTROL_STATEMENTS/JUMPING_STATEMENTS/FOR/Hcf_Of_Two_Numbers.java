import java.util.Scanner;
class Hcf_Of_Two_Numbers
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int n1 = se.nextInt();
		System.out.println("Enter number2 : ");
		int n2 = se.nextInt();
		int hcf = 0;
		for (int i = 1;i<=n1 && i<=n2; i++)
		{
			if(n1%i == 0 && n2%i == 0)
			{
				hcf = i;
			}
		}
		System.out.println(hcf);
	}
}
