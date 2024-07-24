import java.util.Scanner;
class Sorting_Of_Number_In_Ascending_order
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = se.nextInt();
		
		int rev = 0;
		for (int i = 1;i<=9;i++ )
		{
			int temp = n;
			while (temp != 0)
			{
				int ld = temp%10;
				if(i == ld)
				{
					rev = rev*10+i;
				}
				temp /= 10;
			}
		}
		System.out.println(rev);
	}
}
