import java.util.Scanner;
class Simple_Interest
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter principle amount : ");
		float p = se.nextFloat();
		System.out.println("Enter time taken : ");
		float t = se.nextFloat();
		System.out.println("Enter rate of interest : ");
		float r = se.nextFloat();
		System.out.println("Simple interest : "+((p*t*r)/100));
	}
}
