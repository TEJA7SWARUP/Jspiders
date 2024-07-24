import java.util.Scanner;
class Given_Digit_Present_In_Given_Number_Or_Not
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = se.nextInt();
		System.out.println("Enter digit to find in number : ");
		int n = se.nextInt();
		boolean ispresent = false;
		while (num != 0)
		{
			int ld = num%10;
			if (ld == n)
			{
				ispresent = true;
				break;
			}
			num /= 10;
		}
		if(ispresent = true)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("Not present");
		}
	}
}
