import java.util.Scanner;
class Area_of_a_Circle 
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter the radius of circle :");
		float r = se.nextFloat();
		System.out.println("Area of circle : "+(3.14*r*r));
	}
}
