import java.util.Scanner;
class grade_result
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter grade : ");
		char s = se.next().charAt(0);
		if(s == 'A' || s == 'a')
		{
			System.out.println("First rank");
		}
		else if(s == 'B' || s == 'b')
		{
			System.out.println("Second rank");
		}	
		else if(s == 'C' || s == 'c')
		{
			System.out.println("First class");
		}	
		else if(s == 'D' || s == 'd')
		{
			System.out.println("Second class");
		}	
		else if(s == 'E' || s == 'e')
		{
			System.out.println("Just pass");
		}	
		else if(s == 'F' || s == 'f')
		{
			System.out.println("Fail");
		}	
		else
		{
			System.out.println("Enter valid grade.");
		}
	}
}
