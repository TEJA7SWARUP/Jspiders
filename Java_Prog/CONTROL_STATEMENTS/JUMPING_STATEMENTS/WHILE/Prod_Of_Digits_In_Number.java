import java.util.Scanner;
class Prod_Of_Digits_In_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = se.nextInt();
		int temp =num;
		int prod = 1;
		while(temp != 0)
		{
			int ld = temp%10;
			prod = prod*ld;
			temp = temp / 10;
		}
		System.out.println(prod);
	}
}
