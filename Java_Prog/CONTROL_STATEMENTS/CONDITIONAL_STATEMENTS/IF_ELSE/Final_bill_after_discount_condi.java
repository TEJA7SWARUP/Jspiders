import java.util.Scanner;
class Final_bill_after_discount_condi
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter bill amount : ");
		float bill = se.nextFloat();
		if (bill>5000)
		{
			System.out.println("After discount : "+(0.8*bill));
		}
		else
		{
			System.out.println("After discount : "+(0.9*bill));
		}
	}
}
