import java.util.Scanner;
class Xyleom_Or_Phloem
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number to find it is Xyleom or Phloem : ");
		int n = se.nextInt();
		int sum1=n%10;
		n = n/10;
		int sum2 = 0;
		while(n > 9)
		{
			int ld = n%10;
			sum2 += ld;
			n /= 10;
		}
		sum1 += n;
		if(sum1 == sum2)
		{
			System.out.println("Xyleom number");
		}
		else
		{
			System.out.println("Phloem number");
		}
	}
}
