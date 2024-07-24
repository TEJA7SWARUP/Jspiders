import java.util.Scanner;
class print_1_to_n_sum
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter last digit to print : ");
		int num = se.nextInt();
		int sum=0;
		for (int i = 1;i<=num ; i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
