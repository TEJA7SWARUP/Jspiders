import java.util.Scanner;
class ArmStrong_Number
{
	public static void main(String[] args) 
	{
		Scanner se = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = se.nextInt();
		int temp = num;
		int temp1 = num;
		int count = 0;
		int sum =0;
		while(temp1 != 0)
		{
			count++;
			temp1 /= 10;
		}
		while (temp != 0)
		{
			int prod =1;
			int ld = temp%10;
			for (int i = 1;i<=count ;i++ )
			{
				prod *= ld;
			}
			sum += prod;
			temp /= 10;
		}
		if(sum == num)
		{
			System.out.println("Arm Strong..");
		}
		else
		{
			System.out.println("Not A Arm Strong..");
		}
	}
}
