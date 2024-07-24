import java.util.Scanner;
class print_n_to_1
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter last digit to print : ");
		int num = se.nextInt();
		for (int i = num;i>=1 ; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
