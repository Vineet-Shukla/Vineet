
public class Greater 
{
	public static void main(String s[])
	{
		//initializtion of numbers
		int a=20, b=30, c=40;
		//using nested if else to compare the number
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}	
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
	}
}
