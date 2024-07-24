import java.util.Scanner;
class Rank_based_on_marks
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = se.nextInt();
		switch(marks)
		{
			case (marks>=91 && marks<=100): System.out.println("First rank");
		}
	}

}
