import java.util.Scanner;
class Profit_Percentage
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter selling price : ");
		float sp = se.nextFloat();
		System.out.println("Enter cost price : ");
		float cp = se.nextFloat();
		System.out.println("Profit percentage : "+(((sp-cp)/cp)*100));
	}
}
