import java.util.Scanner;
class Vol_of_cylinder
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter radius of cylinder : ");
		float r = se.nextFloat();
		System.out.println("Enter height of cylinder : ");
		float h = se.nextFloat();
		System.out.println("Volume of cylinder is : "+(3.14*r*r*h));
	}
}
