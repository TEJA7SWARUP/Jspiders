import java.util.Scanner;
class Eligible_for_vote_or_not
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = se.nextInt();
		if (age>=18)
		{
			System.out.println("Eligible");
		}
		else 
		{
			System.out.println("Not Eligible");
		}
	}
}
