import java.util.Scanner;
public class Assignment13 
{

	public static void main (String s[])
	
	{
		int a, b, c, d;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a");
			a = sc.nextInt();
			System.out.println(+a);
			System.out.println("Please enter b");
			b = sc.nextInt();
			System.out.println(+b);
			c = a & b;
			System.out.println("Bitwise And Comparison " +c);
			if ((a == 0) && (b == 0))
			{
			System.out.println("Logical And Comparison 0");
			}
			else
			{
				System.out.println("Logical And Comparison 1");
			}
		}
	
	
}
