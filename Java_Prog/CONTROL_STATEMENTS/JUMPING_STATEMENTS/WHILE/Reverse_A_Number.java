import java.util.Scanner;
class Reverse_A_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = se.nextInt();
		int rev = 0;
		while (num != 0)
		{
			int ld = num%10 ;
			rev = rev*10+ld;
			num = num/10;
		}
		System.out.println(rev);
	}
}
