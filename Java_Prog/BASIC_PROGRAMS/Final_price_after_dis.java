import java.util.Scanner;
class Final_price_after_dis
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter Marked price : ");
		float mp = se.nextFloat();
		System.out.println("Enter discount : ");
		float dis = se.nextFloat();
		System.out.println("Profit percentage : "+(((100-dis)/100)*mp));
	}
}
