import java.util.Scanner;
class print_1_to_n
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter last digit to print : ");
		int num = se.nextInt();
		for (int i = 1;i<=num ; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
