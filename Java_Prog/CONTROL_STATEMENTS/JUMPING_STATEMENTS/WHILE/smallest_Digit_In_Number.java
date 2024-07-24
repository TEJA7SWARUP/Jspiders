import java.util.Scanner;
class smallest_Digit_In_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = se.nextInt();
		int smallest = n%10;
		while (n != 0)
		{
			int ld = n%10;
			if (smallest > ld)
			{
				smallest = ld;
			}
			n /= 10;
		}
		System.out.println("smallest : "+smallest);
	}
}
