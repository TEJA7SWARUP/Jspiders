import java.util.Scanner;
class How_Many_Times_Given_Digit_Present_In_Given_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = se.nextInt();
		System.out.println("Enter digit to find in number : ");
		int n = se.nextInt();
		int count=0;
		while (num != 0)
		{
			int ld = num%10;
			if (ld == n)
			{
				count++;
			}
			num /= 10;
		}
		System.out.println(count);
	}
}
