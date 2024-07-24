import java.util.Scanner;
class Palindrome_or_Not
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = se.nextInt();
		int num=n;
		int rev = 0;
		while (num != 0)
		{
			int ld = num%10 ;
			rev = rev*10+ld;
			num = num/10;
		}
		if (rev == n)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}
}
