import java.util.Scanner;
class Larges_Digit_In_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = se.nextInt();
		int largest = n%10;
		while (n != 0)
		{
			int ld = n%10;
			if (largest < ld)
			{
				largest = ld;
			}
			n /= 10;
		}
		System.out.println("Largest : "+largest);
	}
}
