import java.util.Scanner;
class Eligible_for_IAS_Or_not
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = se.nextInt();
		if (age>=21 && age <=32)
		{
			System.out.println("Eligible");
		}
		else	
		{
			System.out.println("Not Eligible");
		}
	}
}
